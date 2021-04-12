package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonBackReference;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.IClientRepository;
import tn.esprit.spring.service.IClientService;

@RestController
@RequestMapping("/User")
@CrossOrigin
public class UserRestController {
	
	/*@Autowired
	IClientService iuserservice;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	IClientRepository iuserRepository;
	
	@JsonBackReference("")
	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@GetMapping("/findall")
	public List<User> getAllUsers() {
		return iuserservice.getAllUsers();
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@GetMapping("/userbyid/{idUser}")
	public User getUserById(@PathVariable("idUser") int idUser) throws Exception {
		return iuserservice.getUserById(idUser);
	}

	
	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@PutMapping("/UpdateUser")
	@ResponseBody
	public User updateUser(@RequestBody User user) throws Exception {
		User userinthedatabase = iuserservice.getUserById(user.getIdUser());
		if (!encoder.encode(user.getPasswordUser()).equals(userinthedatabase.getPasswordUser())) {
			user.setPasswordUser(encoder.encode(user.getPasswordUser()));
		}
		return iuserservice.updateUser(user);
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@DeleteMapping("/deleteUserById/{userId}")
	public void deleteUserById(@PathVariable("userId") Integer userId) throws Exception {
		iuserservice.deleteUserById(userId);
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@PutMapping("/activateUser")
	public User activateUser(@RequestBody User user) throws Exception {
		return iuserservice.activateUser(user);
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@PutMapping("/desactivateUser")
	public User desactivateUser(@RequestBody User user) throws Exception {
		return iuserservice.desactivateUser(user);
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@GetMapping("/findUserLastName/{username}")
	public List<User> findUserLastName(@PathVariable("username") String username) throws Exception {
		return iuserservice.findUserLastName(username);
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@GetMapping("/findUserBylogin/{username}")
	public User findUserByfirstNameUser(@PathVariable("username") String username) throws Exception {
		return iuserservice.findUserByfirstNameUser(username);
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@GetMapping("/findUserRole/{IdUser}")
	public String findUserRole(@PathVariable("IdUser") int IdUser) throws Exception {
		return iuserservice.getUserRoleDescription(IdUser);
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@GetMapping("/findActivatedUser/")
	public List<String> findUserActivated() throws Exception {
		return iuserservice.findUsersActivated();
	}

	@PreAuthorize("hasAuthority('Admin') or hasAuthority('Client') or hasAuthority('DepartmentManager') or hasAuthority('DeliveryPerson')")
	@GetMapping("/findDisabledUser/")
	public List<String> findUserDisabled() throws Exception {
		return iuserservice.getUsersFromDisabled();
	}

*/
}
