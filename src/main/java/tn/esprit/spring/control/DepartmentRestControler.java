

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
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.repository.ProductRepository;
import tn.esprit.spring.service.DepartmentService;


	@RestController
	public class DepartmentRestControler {
		
		
		@Autowired
		DepartmentService departmentService;
		
		@Autowired
		ProductRepository pr ; 
		
		
		
		
		
		// http://localhost:9090/SpringMVC/servlet/retrieve-all-Departments
		@GetMapping("/retrieve-all-Departments")
		@ResponseBody
		public List<Department> getDepartments() {
		List<Department> list = departmentService.retrieveAllDepartments();
		return list;
		}

		//http://localhost:9090/SpringMVC/servlet/retrieve-department/{department-id}
			@GetMapping("/retrieve-department/{department-id}")
			@ResponseBody
			public Department retrieveDepartment(@PathVariable("department-id") int departmentId) {
			return departmentService.retrieveDepartment(departmentId);
			}
			
			
			
			// http://localhost:9090/SpringMVC/servlet/add-department
			@PostMapping("/add-department")
			@ResponseBody
			public Department addDepartment(@RequestBody Department D) {
			Department department1 = departmentService.addDepartment(D);
			return department1;
			}
		
		
			// http://localhost:9090/SpringMVC/servlet/remove-department/{department-id}
				@DeleteMapping("/remove-department/{department-id}")
				@ResponseBody
				public void removeDepartment(@PathVariable("department-id") int departmentId) {
				departmentService.deleteDepartment(departmentId);
				}
				
				
				
				
				//http://localhost:9090/SpringMVC/servlet/update-Department
				@PutMapping("/update-Department")
				@ResponseBody
				public Department updateDepartment(@RequestBody Department dep) {
				return departmentService.DepartmentUpadate(dep);
						
				}
				
				//////////////////////////////////////////////still not working/////////////////////////////
				
				
				
				//http://localhost:9090/SpringMVC/servlet/findproductinDepartment
				
				@GetMapping("/findproductinDepartment/{idD}")
				public List<Product> findProduitNameParRayon(@PathVariable(value = "idD") int idDepartment) {
					return pr.findByIdDepartment(idDepartment);
				}
				
				
				
				
				
				
				
				
				
				
		
				
				
		// http://localhost:9090/SpringMVC/servlet/allocateProductToDepartment/{idd/{idp}  	
	@PutMapping("/allocateProductToDepartment/{iddepartment}/{idproduct}")
	public void allocateProductToDepartment(@PathVariable(value = "iddepartment") int idDepartment,@PathVariable(value = "idproduct") int IdProduct){
					
	departmentService.allocateProductToDepartment(idDepartment, IdProduct);
	}		
		
	
	
	
	
	
	}

	
	
	

