package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Department;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.repository.DepartmentRepository;
import tn.esprit.spring.repository.ProductRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
DepartmentRepository departmentrepository ;
	
	@Autowired
ProductRepository productrepository;
	
	
	private static final Logger L = LogManager.getLogger(DepartmentService.class);
	
	
	@Override
	public List<Department> retrieveAllDepartments() {
		List<Department> departments =(List<Department>) departmentrepository.findAll();
		for (Department dep : departments){
			L.info("dep +++ :" + dep);		
		}
		return departments;
	
		
	}
	
	@Override
	public Department addDepartment(Department D) {
		return departmentrepository.save(D);
	}
	
	
	@Override
	public void deleteDepartment(int idDepartment) {
		departmentrepository.deleteById(idDepartment);
	}

	
	
	@Override
	public Department updateDepartment(Department D) {
		
		return departmentrepository.save(D);
	}
	
	@Override
	public Department retrieveDepartment(int idDepartment) {
		// TODO Auto-generated method stub
		return departmentrepository.findById(idDepartment).get();
	}
	
	
	
	
	
///////////////////////////////////////////////////
@Override
public void allocateProductToDepartment(int idDepartment, int IdProduct) {
Product product = productrepository.findById(IdProduct).get();
Department department = departmentrepository.findById(idDepartment).get();
product.setDepartment(department);
productrepository.save(product);

}


/*
public void deallocateProductFromDepartment(int IdDepartment, int IdProduct) {
	
	Department department = departmentrepository.findById(IdDepartment).get();
	
	int nbp=department.getProduct().size();         //get products
	for(int i = 0; i < nbp; i++){
		if(department.getProduct().get(i).getId() == IdProduct){
			
			department.getProduct().remove(i);
			
		}
	
}
}
*/
	
	
	

}
