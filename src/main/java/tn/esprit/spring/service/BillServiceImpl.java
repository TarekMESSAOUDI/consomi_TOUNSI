package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import tn.esprit.spring.entities.Bill;
import tn.esprit.spring.entities.Order;
import tn.esprit.spring.entities.PaymentType;

import tn.esprit.spring.repository.BillRepository;
import tn.esprit.spring.repository.OrderRepository;






@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillRepository billRepository;
	
	@Autowired OrderRepository orderRepository;
	
	

	private static final Logger L=LogManager.getLogger(BillServiceImpl.class);
	
	
	@Override
	public Bill addBill(Bill b) {
		// TODO Auto-generated method stub
		return billRepository.save(b);
		
	}

	@Override
	public List<Bill> getAllBill() {
		return (List<Bill>)billRepository.findAll();
	}
	
	@Override
	public void deleteBill(Long idBill) {
		billRepository.deleteById(idBill);
		
	}
	
	@Override
	public Bill updateBill(Bill b) {
		
		return billRepository.save(b);
	}
	
	@Override
	public Optional<Bill> getBill_by_ID(Long idBill) {
		return billRepository.findById(idBill);
	}
	
	
	 @Override
	 public List<Bill> getBill_by_Type(PaymentType paymentType){
	    return billRepository.findByPaymentType(paymentType);
	 }
	
	 
	 @Override
	 public List<Bill> getAllBill_by_Order(Long idOrder) {
		return billRepository.getAllBill_by_Order(idOrder);
	}
	 
	 @Override
	 public void assignOrder_to_Bill(Long idOrder, Long idBill) {
	 	
	 	Order order = orderRepository.findById(idOrder).get();
	 	Bill bill =billRepository.findById(idBill).get();
	 	if (ObjectUtils.isEmpty(order) && !ObjectUtils.isEmpty(bill))
	 	order.setBill(bill);
	 	orderRepository.save(order);
	 	}
	 
	 
	 

	
	

	

}
