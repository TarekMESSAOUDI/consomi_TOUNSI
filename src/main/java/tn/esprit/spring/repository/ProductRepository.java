package tn.esprit.spring.repository;
import tn.esprit.spring.entities.Product;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Integer>  {
	
public Product findByTitleProduct(String name);
public List<Product> findAllByTitleProduct(String name);
public List<Product> findAllByIdUnderCategory(int idCategory);
public List<Product> findAllByIdUnderCategoryAndTitleProduct(int idCategory,String name);
public List<Product> findAllByIdDepartment(int idDepartment);

//////////////tarek comptabilité//////////

	@Query("SELECT 'title :',p.titleProduct ,'---->','Gain :', (p.priceProduct) - (p.buyingPriceProduct) FROM Product p")
	public List<String> getgainproduct();
	
	@Query("SELECT  SUM((((p.priceProduct) - (p.buyingPriceProduct))*(p.quantityProduct))),'DT' FROM Product p")
	public float gettotalgainproduct();
	
	@Query("SELECT  SUM((p.buyingPriceProduct)*(p.quantityProduct)) FROM Product p")
	public float getallcostproduct();
	
	@Query("SELECT  SUM((p.priceProduct)*(p.quantityProduct)) FROM Product p")
	public float getallbuyproduct();

}
