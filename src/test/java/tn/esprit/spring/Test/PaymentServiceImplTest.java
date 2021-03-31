package tn.esprit.spring.Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.entities.Payment;
import tn.esprit.spring.entities.PaymentType;

import tn.esprit.spring.service.PaymentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentServiceImplTest {
	
private static final Logger l = LogManager.getLogger(PaymentServiceImplTest.class);

@Autowired
private PaymentService ps;

@Test
public void addPaymentTest() throws ParseException {

SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date = dateFormat.parse("2021-09-02");
Payment p = new Payment(8L,PaymentType.At_Delivery,date);
assertTrue(p.getTypePayment().equals(PaymentType.At_Delivery));

ps.addPayment(p);
}

@Test
public void testDeletepayment(){
	ps.deletepayment(3L);
}

@Test
public void testFindAllPayment() {
	ps.findAll();
}

@Test
public void testFindPayment(){
	System.out.println(ps.findById(2L));
	
}

@Test
public void testfindByType() {
	System.out.println(ps.findByType(PaymentType.By_Card.toString()));
}





}
