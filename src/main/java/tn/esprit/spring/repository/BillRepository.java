package tn.esprit.spring.repository;





import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Bill;
import tn.esprit.spring.entities.Order;
import tn.esprit.spring.entities.PaymentType;





@Repository
public interface BillRepository  extends CrudRepository <Bill,Long> {
	
//	@Query(value = "SELECT * FROM T_BILL t WHERE t.payment_type = :t " , nativeQuery =true)
//	List<Bill> findByType(@Param("t")PaymentType paymentType);
	
	List<Bill> findByPaymentType(PaymentType p);

	
	
	@Query(value = "SELECT * FROM T_BILL t WHERE order_id_order=?1", nativeQuery = true)
    public List<Bill> getAllBill_by_Order(Order order);


	
}