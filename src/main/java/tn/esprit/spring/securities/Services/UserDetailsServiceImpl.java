package tn.esprit.spring.securities.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.service.IClientService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	IClientService cs;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Client user = new Client();
		try {
			user = (Client) cs.findUserByfirstNameUser(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return UserDetailsImpl.build(user);
	}
}
