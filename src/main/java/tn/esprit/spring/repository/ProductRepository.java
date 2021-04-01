package tn.esprit.spring.repository;
import tn.esprit.spring.entities.Product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Integer>  {
	
public Product findByTitleProduct(String name);
public List<Product> findAllByTitleProduct(String name);
public List<Product> findAllByIdUnderCategory(int idCategory);
public List<Product> findAllByIdUnderCategoryAndTitleProduct(int idCategory,String name);
public List<Product> findAllByIdDepartment(int idDepartment);

}
