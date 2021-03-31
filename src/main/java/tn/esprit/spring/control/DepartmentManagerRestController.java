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

import tn.esprit.spring.entities.DepartmentManager;
import tn.esprit.spring.service.IDepartmentManagerService;


@RestController
public class DepartmentManagerRestController {
	
	@Autowired 
	IDepartmentManagerService dmS;
	
			// http://localhost:9090/SpringMVC/servlet/retrieve-all-departmentManagers
			@GetMapping("/retrieve-all-departmentManagers")
			@ResponseBody
			public List<DepartmentManager> getDepartmentManager() {
			List<DepartmentManager> list = dmS.retrieveAllDepartmentManagers();
			return list;
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-departmentManager-by-id/{user-id}
			@GetMapping("/retrieve-departmentManager-by-id/{user-id}")
			@ResponseBody
			public Optional<DepartmentManager> retrieveDepartmentManagerById(@PathVariable("user-id") int userId) {
			return dmS.retrieveDepartmentManagerById(userId);
			}
			
			// http://localhost:9090/SpringMVC/servlet/retrieve-departmentManager-by-salary/{user-salary}
			@GetMapping("/retrieve-departmentManager-by-salary/{user-salary}")
			@ResponseBody
			public List<DepartmentManager> retrieveDepartmentManagerBysalary(@PathVariable("user-salary") float salaryDepartmentManager) {
			return dmS.retrieveDepartmentManagerBysalary(salaryDepartmentManager);
			}
			
			// http://localhost:9090/SpringMVC/servlet/count-departmentmanager
			@GetMapping("/count-departmentmanager")
			@ResponseBody
			public long retrieveDepartmentManagerByCount() {
			return dmS.retrieveDepartmentManagerByCount();
			}
			
			// http://localhost:9090/SpringMVC/servlet/add-departmentManager
			@PostMapping("/add-departmentManager")
			@ResponseBody
			public DepartmentManager addDepartmentManager(@RequestBody DepartmentManager depM) {
			DepartmentManager depm = dmS.addDepartmentManager(depM);
			return depm ;
			}

			// http://localhost:9090/SpringMVC/servlet/delete-departmentManager/{user-id}
			@DeleteMapping("/delete-departmentManager/{user-id}")
			@ResponseBody
			public void deleteDepartmentManager(@PathVariable("user-id") int userId) {
			dmS.deleteDepartmentManager(userId);
			}
			
			// http://localhost:9090/SpringMVC/servlet/update-departmentManager
			@PutMapping("/update-departmentManager")
			@ResponseBody
			public DepartmentManager updateDepartmentManager(@RequestBody DepartmentManager depM) {
			return dmS.updateDepartmentManager(depM);
			}

}
