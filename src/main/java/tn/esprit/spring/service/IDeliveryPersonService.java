package tn.esprit.spring.service;


import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.DeliveryPerson;

public interface IDeliveryPersonService {

	DeliveryPerson addDeliveryPerson(DeliveryPerson d);
	
	boolean deleteDeliveryPerson (int id);
	
	DeliveryPerson updateDeliveryPerson(DeliveryPerson d);

	Optional<DeliveryPerson> retrieveDeliveryPerson(int idUser);
	
	List<DeliveryPerson> retrieveAllDeliveryPerson();
}
