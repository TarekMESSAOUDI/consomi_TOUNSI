package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Department;
import tn.esprit.spring.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
DepartmentRepository departmentrepository ;
	
	
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

}
