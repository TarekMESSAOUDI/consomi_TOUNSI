package tn.esprit.spring.repository;







import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Payment;
import tn.esprit.spring.entities.PaymentType;




@Repository
public interface PaymentRepository  extends CrudRepository <Payment,Long> {

	

	@Query(value = "SELECT * FROM T_PAYMENT tp WHERE tp.type_Payment = :t " , nativeQuery =true)
			List<Payment> findByType(@Param("t")String typePayment);	
	//SELECT * FROM T_PAYMENT WHERE type_Payment := TP 
	//@Param("t") 
	//public Payment findByTypePayment(PaymentType typePayment);
     

	

}
