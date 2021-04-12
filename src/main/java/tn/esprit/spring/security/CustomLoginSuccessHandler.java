package tn.esprit.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.service.ClientServiceImpl;
import tn.esprit.spring.service.IClientService;


@Component
public class CustomLoginSuccessHandler {
	
	@Autowired
	PasswordEncoder encoder;
	
    @Autowired
    private IClientService userService;
    
    @Transactional
    public boolean onAuthenticationSuccess(String username, String password) throws Exception {
    	Client user =  userService.findUserByfirstNameUser(username);
    	if (user==null)
    		return false;
    	else if (encoder.matches(password, user.getPasswordUser())) {
            if (user.getFailedAttempt() > 0) {
                userService.resetFailedAttempts(user.getFirstNameUser());
            }
    		return true;
    	}
        if (user.isStateUser() && user.isAccountNonLocked()) {
            if (user.getFailedAttempt() < ClientServiceImpl.MAX_FAILED_ATTEMPTS - 1) {
                userService.increaseFailedAttempts(user);
                return false;
            } else {
                userService.lock(user);
                return false;
            }
        } else if (!user.isAccountNonLocked()) {
            if (userService.unlockWhenTimeExpired(user)) {
            	return false;
            }
        }
        return false;
    }

}
