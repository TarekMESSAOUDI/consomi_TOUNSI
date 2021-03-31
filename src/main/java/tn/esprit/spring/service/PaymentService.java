package tn.esprit.spring.service;



import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Payment;
import tn.esprit.spring.entities.PaymentType;


public interface PaymentService {

	Payment addPayment(Payment p);
	public void deletepayment(Long idPayment);
  List<Payment> findAll();
	//void findPayment(int idPayment);
	List<Payment> findByType(String typePayment);
	//Payment GetByTypePayment(PaymentType typePayment);
	Optional<Payment> findById(Long idPayment);
	
	
	
	
	
	
	
	
	
	

}
