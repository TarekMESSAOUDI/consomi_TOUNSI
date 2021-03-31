package tn.esprit.spring.service;


import java.util.List;


import tn.esprit.spring.entities.DeliveryPerson;

public interface IDeliveryPersonService {

	DeliveryPerson addDeliveryPerson(DeliveryPerson d);
	
	boolean deleteDeliveryPerson (int id);
	
	DeliveryPerson updateDeliveryPerson(DeliveryPerson d);

	DeliveryPerson retrieveDeliveryPerson(int id);
	
	List<DeliveryPerson> retrieveAllDeliveryPerson();
}
