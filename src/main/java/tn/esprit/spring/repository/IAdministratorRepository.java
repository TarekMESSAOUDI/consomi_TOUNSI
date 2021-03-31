package tn.esprit.spring.repository;


import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Administrator;

public interface IAdministratorRepository extends CrudRepository <Administrator, Integer>{

	
}