package tn.esprit.spring.repository;




import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.entities.TypeStock;

public interface StockRepository extends CrudRepository<Stock,Long> {

	@Query(value = "SELECT * FROM T1_Stock stk WHERE stk.name_Stock = :t" , nativeQuery =true)      // Stock Rest messing
List<Stock> findByName(@Param("t")String nameStock);
	
	
	/*
	@Query(value = "SELECT * FROM T1_Stock stk WHERE stk.TypeStock = :t " , nativeQuery =true)
	List<Stock> findByTypeStock(@Param("t")TypeStock TypeStock);
	
	*/
	
	/*
	@Query("SELECT p.id FROM product p,stock s  WHERE   s.amount<10 ")   
	List<Long> missingProduct();
	*/
	
	
}
