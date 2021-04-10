package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Basket;

public interface IBasketRepository extends CrudRepository<Basket, Integer>{
	
	/*@Query("Select "
				+ "DISTINCT b.amountBasket FROM Basket b"
				+ "join b.User u "
				+ "where u.idUser =:idUser")
	    public float getAmountBasketByClientId(@Param("idUser")int idUser);*/
	
	@Query("SELECT AVG(b.amountBasket) FROM Basket b")
	public float getmoyAmountBasket();

	@Query("SELECT AVG(b.amountBasket)*COUNT(b.idBasket) FROM Basket b")
	public float gettotalAmountBasket();
	
	@Query("SELECT MAX(b.amountBasket) FROM Basket b")
	public float getmaxAmountBasket();
	
	@Query("SELECT COUNT(b.amountBasket) FROM Basket b")
	public float getcountBasket();
	
	@Query("SELECT STDDEV(b.amountBasket) FROM Basket b")
	public float getecartamountBasket();
	
}
