package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Department;
import tn.esprit.spring.entities.Product;

public interface DepartmentService {

	

	Department addDepartment(Department D);

	void deleteDepartment(int idDepartment);

	Department updateDepartment(Department D);

	Department retrieveDepartment(int idDepartment);

	List<Department> retrieveAllDepartments();

	void allocateProductToDepartment(int idDepartment, int IdProduct);

	

	List<Product> findProdcutInDepartment(int idDepartment);



	

}
