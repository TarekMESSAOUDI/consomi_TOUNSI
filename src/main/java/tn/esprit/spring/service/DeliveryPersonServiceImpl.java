package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entities.DeliveryPerson;
import tn.esprit.spring.repository.DeliveryPersonRepository;

@Service
public class DeliveryPersonServiceImpl implements IDeliveryPersonService {

	@Autowired
	DeliveryPersonRepository dr;
	@Override
	public DeliveryPerson addDeliveryPerson(DeliveryPerson d) {
		
	return	dr.save(d);
		
	}
	@Override
	public boolean deleteDeliveryPerson(int id) {
		if(dr.existsById(id)){
			dr.deleteById(id);
			return true;
		}else{
		return false;}
	}
	@Override
	public DeliveryPerson updateDeliveryPerson(DeliveryPerson d) {
		return dr.save(d);
	}
	@Override
	public DeliveryPerson retrieveDeliveryPerson(int id) {
		return (DeliveryPerson) dr.findAll();

}
	@Override
	public List<DeliveryPerson> retrieveAllDeliveryPerson() {
		
		return (List<DeliveryPerson>) dr.findAll();
	}
	}

