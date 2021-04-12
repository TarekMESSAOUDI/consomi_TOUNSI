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
	@Autowired
	 IDeliveryPersonService dPs;
	
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
	@Override
	public void getSalaryDeliveryPerson(int id) {
		
		DeliveryPerson d=dr.findByIdUser(id);
		if(dr.getAllDelivery(id).size()>100) {	
		
		 d.setSalaryDeliveryPerson(5*dr.getAllDelivery(id).size()+100);
		dr.save(d);
		}
	else if(dr.getAllDelivery(id).size()<=100 && 50<dr.getAllDelivery(id).size()) {
		
		d.setSalaryDeliveryPerson(5*dr.getAllDelivery(id).size()+50);
		dr.save(d);
	}
	else {
		d.setSalaryDeliveryPerson(5*dr.getAllDelivery(id).size());
		dr.save(d);
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	}

