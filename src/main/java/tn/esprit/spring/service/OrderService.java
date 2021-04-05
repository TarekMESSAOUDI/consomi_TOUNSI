
package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Order;
import tn.esprit.spring.entities.PaymentType;

public interface OrderService {

	Order addOrder(Order o);

	Order updateOrder(Order o);

	void deleteOrder(Long idOrder);

	List<Order> getAllOrder();

	List<Order> getOrder_by_Type(PaymentType paymentType);

	void Pay_By_Card(Long idOrder);

	void Pay_At_Delivery(Long idOrder);

	

}

