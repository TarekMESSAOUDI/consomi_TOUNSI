package tn.esprit.spring.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Administrator;
import tn.esprit.spring.repository.IAdministratorRepository;
import tn.esprit.spring.service.IAdministratorService;


@RestController
public class AdministratorRestController {
	
	@Autowired 
	IAdministratorService aS;
	
	@Autowired 
	IAdministratorRepository aR;
	
		// http://localhost:9090/SpringMVC/servlet/retrieve-all-administrators
		@GetMapping("/retrieve-all-administrators")
		@ResponseBody
	 	public List<Administrator> getAdministrator() {
		List<Administrator> list = aS.retrieveAllAdministrators();
		return list;
		}
		
		// http://localhost:9090/SpringMVC/servlet/retrieve-administrator-by-id/{user-id}
		@GetMapping("/retrieve-administrator-by-id/{user-id}")
		@ResponseBody
		public Optional<Administrator> retrieveAdministratorById(@PathVariable("user-id") int userId) {
		return aS.retrieveAdministratorById(userId);
		}
		
		// http://localhost:9090/SpringMVC/servlet/retrieve-administrator-by-type/{user-type}
		@GetMapping("/retrieve-administrator-by-type/{user-typeadmin}")
		@ResponseBody
		public List<Administrator> retrieveAdministratorByTypeAdmin(@PathVariable("user-typeadmin") String typeAdmin) {
		return aS.retrieveAdministratorByTypeAdmin(typeAdmin);
		}
		
		// http://localhost:9090/SpringMVC/servlet/retrieve-administrator-by-speciality/{user-speciality}
		@GetMapping("/retrieve-administrator-by-speciality/{user-speciality}")
		@ResponseBody
		public List<Administrator> retrieveAdministratorBySpecialityAdmin(@PathVariable("user-speciality") String specialityAdmin) {
		return aS.retrieveAdministratorSpecialityAdmin(specialityAdmin);
		}
		
		// 		
		@PostMapping("/add-administrator")
		@ResponseBody
		public Administrator addAdministrator(@RequestBody Administrator admin) {
		Administrator ad = aS.addAdministrator(admin);
		return ad;
		}

		// http://localhost:9090/SpringMVC/servlet/delete-administrator/{user-id}
		@DeleteMapping("/delete-administrator/{user-id}")
		@ResponseBody
		public void deleteAdministrator(@PathVariable("user-id") int userId) {
		aS.deleteAdministrator(userId);
		}
		
		// http://localhost:9090/SpringMVC/servlet/update-administrator
		@PutMapping("/update-administrator")
		@ResponseBody
		public Administrator updateAdministrator(@RequestBody Administrator admin) {
		return aS.updateAdministrator(admin);
		}
		
		// http://localhost:9090/SpringMVC/servlet/retreive-name-and-speciality
		@GetMapping("/retreive-name-and-speciality")
		@ResponseBody
		public List<String> getNameAndSpecialityAdmin(){
			return aR.getNameAndSpecialityAdmin();
			
		}
}
