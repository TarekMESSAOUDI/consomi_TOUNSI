package tn.esprit.spring.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.*;
@Repository
public interface DeliveryPersonRepository extends CrudRepository<DeliveryPerson,Integer> {

	public DeliveryPerson findByIdUser(int id);
	
	
	@Query("select e.Delivery from DeliveryPerson e where e.id = :id")
	List<Delivery> getAllDelivery(int id);
	

}
