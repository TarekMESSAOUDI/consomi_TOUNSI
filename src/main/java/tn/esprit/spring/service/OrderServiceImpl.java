package tn.esprit.spring.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entities.Order;

import tn.esprit.spring.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	

	private static final Logger L=LogManager.getLogger(OrderServiceImpl.class);
	
	
	@Override
	public Order addOrder(Order o) {
		// TODO Auto-generated method stub
		return orderRepository.save(o);
		
	}
	
	

}
