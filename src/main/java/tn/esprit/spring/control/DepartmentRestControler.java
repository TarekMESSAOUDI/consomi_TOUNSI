

	package tn.esprit.spring.control;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Department;

import tn.esprit.spring.service.DepartmentService;


	@RestController
	public class DepartmentRestControler {
		
		
		@Autowired
		DepartmentService departmentService;
		
		
		
		
		
		// http://localhost:8081/SpringMVC/servlet/retrieve-all-Departments
		@GetMapping("/retrieve-all-Departments")
		@ResponseBody
		public List<Department> getDepartments() {
		List<Department> list = departmentService.retrieveAllDepartments();
		return list;
		}

		//http://localhost:8081/SpringMVC/servlet/retrieve-department/{department-id}
			@GetMapping("/retrieve-department/{department-id}")
			@ResponseBody
			public Department retrieveDepartment(@PathVariable("department-id") int departmentId) {
			return departmentService.retrieveDepartment(departmentId);
			}
			
			
			
			// http://localhost:8081/SpringMVC/servlet/add-department
			@PostMapping("/add-department")
			@ResponseBody
			public Department addDepartment(@RequestBody Department D) {
			Department department1 = departmentService.addDepartment(D);
			return department1;
			}
		
		
			// http://localhost:8081/SpringMVC/servlet/remove-department/{department-id}
				@DeleteMapping("/remove-department/{department-id}")
				@ResponseBody
				public void removeDepartment(@PathVariable("department-id") int departmentId) {
				departmentService.deleteDepartment(departmentId);
				}
				// http://localhost:8081/SpringMVC/servlet/modify-department
				@PutMapping("/modify-department")
				@ResponseBody
				public Department modifyDepartment(@RequestBody Department department) {
				return departmentService.addDepartment(department);
				}
		
		
	}

	
	
	

