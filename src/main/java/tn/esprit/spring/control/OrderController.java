
package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entities.Order;
import tn.esprit.spring.entities.PaymentType;
import tn.esprit.spring.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	// http://localhost:8081/SpringMVC/servlet/add-order
	@PostMapping("/add-order")
	@ResponseBody
	public Order addOrder(@RequestBody Order o) {
	Order order = orderService.addOrder(o);
	return order;
	}
	
	// http://localhost:8081/SpringMVC/servlet/modify-order
				@PutMapping("/modify-order")
				@ResponseBody
				public Order updateOrder(@RequestBody Order o) {
				return orderService.updateOrder(o);
				}
	
	// URL : http://localhost:8081/SpringMVC/servlet/delete-order
				 @DeleteMapping(value = "delete-order/{idOrder}")
				   
				public void deleteOrder(@PathVariable("idOrder")Long idOrder){
					   orderService.deleteOrder(idOrder);
				   }
				 
	// URL : http://localhost:8081/SpringMVC/servlet/getAllOrder
				@GetMapping(value = "getAllOrder")
				  
				public List<Order> getAllOrder(){
				return orderService.getAllOrder();
					}
				
				
	// URL : http://localhost:8081/SpringMVC/servlet/getOrder_by_Type/At_Delivery
				 @GetMapping(value = "getOrder_by_Type/{paymentType}")
				   
				 public List<Order> getOrder_by_Type(@PathVariable("paymentType")PaymentType paymentType) {
						return orderService.getOrder_by_Type(paymentType);
				}
				 
	// URL : http://localhost:8081/SpringMVC/servlet/pay_By_Card			 
				 @PutMapping("/pay_By_Card/{idOrder}")
				
				 public void Pay_By_Card(@PathVariable(value = "idOrder") Long idOrder) {
						orderService.Pay_By_Card(idOrder);
				 }
				
	// URL : http://localhost:8081/SpringMVC/servlet/pay_At_Delivery			 
				 @PutMapping("/pay_At_Delivery/{idOrder}")
				
				 public void Pay_At_Delivery(@PathVariable(value = "idOrder") Long idOrder) {
						orderService.Pay_At_Delivery(idOrder);
				 }
	

}

