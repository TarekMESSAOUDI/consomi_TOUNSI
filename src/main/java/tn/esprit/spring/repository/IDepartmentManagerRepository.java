package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Administrator;
import tn.esprit.spring.entities.DepartmentManager;

public interface IDepartmentManagerRepository extends CrudRepository <DepartmentManager, Integer>{
	
	List<DepartmentManager> findBySalaryDepartmentManagerGreaterThan (float salaryDepartmentManager);
	
	long  count();

}
