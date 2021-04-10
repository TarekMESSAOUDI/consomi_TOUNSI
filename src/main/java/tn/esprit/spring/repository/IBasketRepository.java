package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entities.Basket;

public interface IBasketRepository extends CrudRepository<Basket, Integer>{
	
	/* @Query("Select "
				+ "DISTINCT u.rankClient from User u"
				/*+ "join u.Basket b "
				+ "where b.idBasket=:idBasket")
	    public Double getRankClientByBasketId(@Param("idBasket")int idBasket);*/

}
