package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.SexeType;

public interface IClientRepository extends CrudRepository <Client, Integer>{

	List<Client> findByRankClient(int rankClient);

	List<Client> findByPointNumberClientGreaterThan(int pointNumberClient);

	List<Client> findByFirstNameUser(String firstNameUser);
	
	List<Client> findByStateUser(boolean stateUser);
	
	List<Client> findByAdressUser(String adressUser);
	
	List<Client> findByBirthDateUser(Date birthDateUser);
	
	List<Client> findBySexeUser(SexeType sexeUser);
	
	long  count();
}