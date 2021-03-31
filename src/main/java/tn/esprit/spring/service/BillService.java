package tn.esprit.spring.service;


import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Bill;
import tn.esprit.spring.entities.Order;
import tn.esprit.spring.entities.PaymentType;





public interface BillService {
	
	
	public List<Bill> getAllBill();

	Bill addBill(Bill b);

	void deleteBill(Long idBill);

	Bill updateBill(Bill b);

	Optional<Bill> getBill_by_ID(Long idBill);

	List<Bill> getBill_by_Type(PaymentType paymentType);

	List<Bill> getAllBill_by_Order(Order order);

	void assignOrder_to_Bill(Long idOrder, Long idBill);
	

	

	

	

}
