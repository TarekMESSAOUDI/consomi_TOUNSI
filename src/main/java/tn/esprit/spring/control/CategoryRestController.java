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


import tn.esprit.spring.entities.Category;

import tn.esprit.spring.service.ICategoryService;

@RestController
public class CategoryRestController {
	
	@Autowired
	ICategoryService CS;
	
	//http://localhost:9090/SpringMVC/servlet/add-category
		@PostMapping("/add-category")
		@ResponseBody
		public Category addProduct(@RequestBody Category c) {
		Category cat = CS.addCategory(c);
		return cat;
		}
		
		
		//http://localhost:9090/SpringMVC/servlet/remove-category/{categorytId}
		@DeleteMapping("/remove-category/{categorytId}")
		@ResponseBody
		public void removeCategory(@PathVariable("categorytId") int catId) {
		CS.deleteCategry(catId);
		}
		
		
		
		//http://localhost:9090/SpringMVC/servlet/update-category
		@PutMapping("/update-category")
		@ResponseBody
		public Category updateProduct(@RequestBody Category c) {
		return CS.updateCategory(c);
				
		}
		
		
		//http://localhost:9090/SpringMVC/servlet/show-all-categories
		@GetMapping("/show-all-categories")
		@ResponseBody
		public List<Category> getAllProducts(){
			List <Category> list=CS.showAll();
			return list;
		}
	
}
