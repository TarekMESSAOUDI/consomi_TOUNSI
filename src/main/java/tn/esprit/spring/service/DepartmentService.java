package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Department;

public interface DepartmentService {

	

	Department addDepartment(Department D);

	void deleteDepartment(Long idDepartment);

	Department updateDepartment(Department D);

	Department retrieveDepartment(Long idDepartment);

	List<Department> retrieveAllDepartments();

	

}
