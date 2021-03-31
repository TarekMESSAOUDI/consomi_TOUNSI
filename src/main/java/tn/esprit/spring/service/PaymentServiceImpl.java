package tn.esprit.spring.service;



import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import tn.esprit.spring.entities.Payment;
import tn.esprit.spring.entities.PaymentType;
import tn.esprit.spring.repository.PaymentRepository;



@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;

	private static final Logger L =LogManager.getLogger(PaymentServiceImpl.class);

	@Override
	public Payment addPayment(Payment payment) {
		return paymentRepository.save(payment);
		
	}
	
	@Override
	public void deletepayment(Long idPayment) {
		paymentRepository.deleteById(idPayment);
		
	}
	
	@Override
	public List<Payment> findAll() {
		return (List<Payment>)paymentRepository.findAll();
	}
	
	@Override
	public  Optional<Payment> findById(Long idPayment){
		 return paymentRepository.findById(idPayment);
		
	}
	
    @Override
    public List<Payment> findByType(String typePayment){
    	return (List<Payment>)paymentRepository.findByType(typePayment);
   }

	
    	
	//@Override
	//public Payment GetByTypePayment(PaymentType typePayment) {
		//paymentRepository.findByTypePayment(typePayment);
		//return null;
	//}
    
	
}
	


