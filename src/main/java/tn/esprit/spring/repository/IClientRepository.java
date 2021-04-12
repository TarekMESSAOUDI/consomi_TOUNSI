package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.SexeType;

@Repository
public interface IClientRepository extends CrudRepository <Client, Integer>{

	List<Client> findByRankClient(int rankClient);

	List<Client> findByPointNumberClientGreaterThan(int pointNumberClient);

	List<Client> findByFirstNameUser(String firstNameUser);
	
	List<Client> findByStateUser(boolean stateUser);
	
	List<Client> findByAdressUser(String adressUser);
	
	List<Client> findByBirthDateUser(Date birthDateUser);
	
	List<Client> findBySexeUser(SexeType sexeUser);
	
	
	long  count();

	@Query("SELECT e.firstNameUser,e.emailUser FROM User e where e.rankClient is not null")
	List<String> getAllClientNames();
	
	@Query("SELECT MAX(e.rankClient),e.phoneNumberUser FROM User e where e.rankClient is not null")
	List<String> getMaxRank();
	
	@Query("SELECT e.phoneNumberUser,e.adressUser FROM User e GROUP BY e.adressUser")
	List<String> getphonegoupbyadress();
	
	@Query("SELECT MAX(e.birthDateUser) FROM User e ")
	Date getminage();

}