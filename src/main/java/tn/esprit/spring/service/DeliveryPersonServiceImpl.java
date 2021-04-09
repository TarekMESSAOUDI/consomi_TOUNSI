package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

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
		d.setRoleUser("DELIVERY_PERSON");
	return	dr.save(d);
		
	}
	@Override
	public boolean deleteDeliveryPerson(int idUser) {
		if(dr.existsById(idUser)){
			dr.deleteById(idUser);
			return true;
		}else{
		return false;}
	}
	@Override
	public DeliveryPerson updateDeliveryPerson(DeliveryPerson d) {
		return dr.save(d);
	}
	
	@Override
	public Optional<DeliveryPerson> retrieveDeliveryPerson(int idUser) {
		
		return dr.findById(idUser);
	}


	@Override
	public List<DeliveryPerson> retrieveAllDeliveryPerson() {
		
		return (List<DeliveryPerson>) dr.findAll();
	}
	
	}

