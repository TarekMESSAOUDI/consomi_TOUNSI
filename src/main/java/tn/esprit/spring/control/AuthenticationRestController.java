package tn.esprit.spring.control;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Jwt.JwtUtils;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.fileUpmessage.JwtResponse;
import tn.esprit.spring.fileUpmessage.ResponseMessage;
import tn.esprit.spring.payload.LoginRequest;
import tn.esprit.spring.securities.Services.UserDetailsImpl;
import tn.esprit.spring.security.CustomLoginSuccessHandler;
import tn.esprit.spring.service.ClientServiceImpl;
import tn.esprit.spring.service.EmailService;
import tn.esprit.spring.service.IClientService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping("/User/Access")
public class AuthenticationRestController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	CustomLoginSuccessHandler customLoginSuccessHandler;
	
	@Autowired
	IClientService iuserservice;

	//@Autowired
	//IRoleService iroleservice;

	@Autowired
	PasswordEncoder encoder;

	//@Autowired
	JwtUtils jwtUtils;

	@Autowired
	private EmailService emailService;

	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
		boolean verifMdp = customLoginSuccessHandler.onAuthenticationSuccess(loginRequest.getUsername(),
				loginRequest.getPassword());
		if (verifMdp) {
			Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
			SecurityContextHolder.getContext().setAuthentication(authentication);
			String jwt = jwtUtils.generateJwtToken(authentication);

			UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
			List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
					.collect(Collectors.toList());

			return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getUsername(), roles.get(0).toString()));
		}
		return ResponseEntity.ok("Une erreur est produit verifier vos coordonées");
	}

	@PostMapping("/signup")
	@ResponseBody
	public ResponseEntity<?> addClient(@RequestBody Client user) throws Exception {
		if (user == null) {
			return ResponseEntity.badRequest().body(new ResponseMessage("Error: please add values!"));
		}
		if (user.getAdressUser().equals("")) {
			return ResponseEntity.badRequest().body(new ResponseMessage("Error: please add address!"));
		}
		if (user.getAdressUser().equals("")) {
			return ResponseEntity.badRequest().body(new ResponseMessage("Error: please add bithday date!"));
		}
		if (!(user.getBirthDateUser() instanceof Date)) {
			return ResponseEntity.badRequest().body(new ResponseMessage("Error: please add bithday date!"));
		}
		if (user.getFirstNameUser().equals("")) {
			return ResponseEntity.badRequest().body(new ResponseMessage("Error: please add your first name!"));
		}
		if (user.getEmailUser().equals("") || !ClientServiceImpl.validate(user.getEmailUser())) {
			return ResponseEntity.badRequest().body(new ResponseMessage("Error: please check your mail!"));
		}
		if (iuserservice.findUserByfirstNameUser(user.getFirstNameUser()) != null) {
			return ResponseEntity.badRequest().body(new ResponseMessage("Error: Username is already taken!"));
		}
		// Create new user's account
		user.setPasswordUser(encoder.encode(user.getPasswordUser()));
		if (user.getRoleUser() == null) {
			return ResponseEntity.badRequest()
					.body(new ResponseMessage("Error: Could you please add a role for the new user!"));
		}
		user.setStateUser(true);
		user.setAccountNonLocked(true);
		user.setFailedAttempt(0);
		/*
		SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
		passwordResetEmail.setTo(user.getEmailUser());
		passwordResetEmail.setSubject("Registration");
		passwordResetEmail.setText(
				"Dear " + user.getFirstNameUser() + ":\n" + "Félicitation !" 
						+ ":\n" 
						+ "Your role is " + user.getRoleUser()
						+ ".\n"
						+"in your consommi tounsi account") ;

		emailService.sendEmail(passwordResetEmail);*/
		iuserservice.createUser((Client) user);
		return ResponseEntity.ok(new ResponseMessage("User registered successfully! "+ "your username :"+ user.getFirstNameUser()+"\n your password is "+user.getPasswordUser()+"\n your mail adress :"+user.getEmailUser()+" \n your role :"+user.getRoleUser()));
	}

	@PostMapping("/forgot/{login}")
	public String processForgotPasswordForm(@PathVariable("login") String login,
			HttpServletRequest request) throws Exception {
		Client user = (Client) iuserservice.findUserByfirstNameUser(login);

		if (user == null) {
			return "user not found";
		} else {
			// Generate random 36-character string token for reset password
			user.setResettoken(UUID.randomUUID().toString());

			// Save token to database
			iuserservice.updateUser((Client) user);

			String appUrl = request.getServerName()+":"+request.getServerPort()+request.getContextPath();

			// Email message
			SimpleMailMessage passwordResetEmail = new SimpleMailMessage();
			passwordResetEmail.setTo(user.getEmailUser());
			passwordResetEmail.setSubject("Password Reset Request");
			passwordResetEmail.setText("To reset your password, click the link below:\n" + appUrl + "/servlet/User/Access/reset/"
					+ user.getResettoken());

			emailService.sendEmail(passwordResetEmail);
		}
		return "mail sent";

	}

	// Process reset password form
	@PostMapping("/reset/{token}/{newpassword}")
	public String setNewPassword(@PathVariable("token") String token,@PathVariable("newpassword") String newpassword ) throws Exception {
		Client user = iuserservice.findUserByResetToken(token);
		if (user != null) {
			user.setPasswordUser(encoder.encode(newpassword));
			user.setResettoken(null);
			iuserservice.updateUser((Client) user);
			return "passwored reseted";

		} else {
			return "operation regected";
		}
	}

}
