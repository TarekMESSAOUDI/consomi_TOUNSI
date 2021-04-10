package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Administrator;
import tn.esprit.spring.entities.DepartmentManager;

public interface IDepartmentManagerRepository extends CrudRepository <DepartmentManager, Integer>{
	
	List<DepartmentManager> findBySalaryDepartmentManagerGreaterThan (float salaryDepartmentManager);
	
	long  count();

	@Query("SELECT AVG(d.salaryDepartmentManager) from DepartmentManager d")
	float retrievemoysalaire();

	@Query("SELECT COUNT(d.salaryDepartmentManager)*AVG(d.salaryDepartmentManager) from DepartmentManager d")
	float retrievesommesalaire();
	
	@Query("SELECT MAX(d.salaryDepartmentManager) from DepartmentManager d")
	float retrievemaxsalaire();
	
	

}
