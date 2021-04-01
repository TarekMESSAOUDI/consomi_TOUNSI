package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository <Order,Long> {

	


	
	

}
