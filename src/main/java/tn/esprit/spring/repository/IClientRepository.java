package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.SexeType;
import tn.esprit.spring.entities.User;

@Repository
@Transactional
public interface IClientRepository extends CrudRepository <Client, Integer>{

	List<Client> findByRankClient(int rankClient);

	List<Client> findByPointNumberClientGreaterThan(int pointNumberClient);

	Client findByFirstNameUser(String firstNameUser);
	
	List<Client> findByStateUser(boolean stateUser);
	
	List<Client> findByAdressUser(String adressUser);
	
	List<Client> findByBirthDateUser(Date birthDateUser);
	
	List<Client> findBySexeUser(SexeType sexeUser);
	
	long  count();
	
	@Query("SELECT u.roleUser FROM User u where  u.id =:id")
	public String getUserRole(@Param("id")int id);
	
	@Query("SELECT CONCAT(u.firstNameUser,CONCAT(' ',u.lastNameUser)) FROM User u where  u.stateUser =TRUE")
	public List<String> getUsersFromActivated();
	
	@Query("SELECT CONCAT(u.firstNameUser,CONCAT(' ',u.lastNameUser)) FROM User u where  u.stateUser =FALSE")
	public List<String> getUsersFromDisabled();
	
	@Query("UPDATE User u SET u.failedAttempt = ?1 WHERE u.firstNameUser = ?2")
    @Modifying
    public void updateFailedAttempts(int failAttempts, String login);
	Client findUserByresettoken(String login);
	
	@Query("Select u FROM User u where u.roleUser= :role")
	List<Client> findAllByRole(@Param("role") User user);

	@Query("SELECT e.firstNameUser,e.emailUser FROM User e where e.rankClient is not null")
	List<String> getAllClientNames();
	
	@Query("SELECT MAX(e.rankClient),e.phoneNumberUser FROM User e where e.rankClient is not null")
	List<String> getMaxRank();
	
	@Query("SELECT e.phoneNumberUser,e.adressUser FROM User e GROUP BY e.adressUser")
	List<String> getphonegoupbyadress();
	
	@Query("SELECT MAX(e.birthDateUser) FROM User e ")
	Date getminage();

}