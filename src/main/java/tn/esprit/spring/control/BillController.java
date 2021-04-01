package tn.esprit.spring.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Bill;
import tn.esprit.spring.entities.PaymentType;
import tn.esprit.spring.service.BillService;
@RestController
public class BillController {
	
	@Autowired
	private BillService billService;
	
	// http://localhost:9090/SpringMVC/servlet/add-bill
		@PostMapping("/add-bill")
		@ResponseBody
		public Bill addBill(@RequestBody Bill b) {
		Bill bill = billService.addBill(b);
		return bill;
		}
	
	// URL : http://localhost:9090/SpringMVC/servlet/getAllBill
	    @GetMapping(value = "getAllBill")
	  
	    public List<Bill> getAllBill(){
		return billService.getAllBill();
		}
	    
	 // URL : http://localhost:9090/SpringMVC/servlet/delete-bill
		   @DeleteMapping(value = "delete-bill/{idBill}")
		   
			public void deleteBill(@PathVariable("idBill")Long idBill){
			   billService.deleteBill(idBill);
		   }
		   
		// http://localhost:9090/SpringMVC/servlet/modify-bill
			@PutMapping("/modify-bill")
			@ResponseBody
			public Bill modifyUser(@RequestBody Bill bill) {
			return billService.updateBill(bill);
			}
			
		// URL : http://localhost:9090/SpringMVC/servlet/getBill_by_ID/8
			 @GetMapping(value = "getBill_by_ID/{idBill}")
			   
			 public Optional<Bill> getBill_by_ID(@PathVariable("idBill")Long idBill) {
					return billService.getBill_by_ID(idBill);
			}
			 
		// URL : http://localhost:9090/SpringMVC/servlet/getBill_by_Type/At_Delivery
			 @GetMapping(value = "getBill_by_Type/{paymentType}")
			   
			 public List<Bill> getBill_by_Type(@PathVariable("paymentType")PaymentType paymentType) {
					return billService.getBill_by_Type(paymentType);
			}
			 
			 
			// URL : http://localhost:9090/SpringMVC/servlet/getAllBill_by_Order/1
			 @GetMapping(value = "getAllBill_by_Order/{idOrder}")
			   
			 public List<Bill> getAllBill_by_Order(@PathVariable("idOrder")Long idOrder) {
					return billService.getAllBill_by_Order(idOrder);
			}
			 
			 
			 @PutMapping("/assignOrder_to_Bill/{idBill}/{idOrder}")
			 @ResponseBody
			 public void assignOrder_to_Bill(@PathVariable("idOrder") Long idOrder, @PathVariable("idBill") Long idBill) {
				billService.assignOrder_to_Bill(idOrder,idBill);

			}
			
	
	
	
	

}
