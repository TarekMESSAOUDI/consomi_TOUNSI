package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.DepartmentManager;


public interface IDepartmentManagerService {
	
	DepartmentManager addDepartmentManager(DepartmentManager DepM);

	DepartmentManager updateDepartmentManager(DepartmentManager DepM);

	boolean deleteDepartmentManager(int id);

	Optional<DepartmentManager> retrieveDepartmentManagerById(int id);
	
	List<DepartmentManager> retrieveAllDepartmentManagers();

}
