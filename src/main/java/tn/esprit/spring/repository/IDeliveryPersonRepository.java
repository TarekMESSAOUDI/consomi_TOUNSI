package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.DeliveryPerson;

public interface IDeliveryPersonRepository extends CrudRepository <DeliveryPerson, Integer>{

}
