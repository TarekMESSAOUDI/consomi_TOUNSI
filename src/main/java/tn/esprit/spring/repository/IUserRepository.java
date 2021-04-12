package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.User;

/*@Transactional
@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{
	
	User findByfirstNameUser(String userName);
    List<User> findBylastNameUser(String userName);
	User findByidUser(int idUser);
	
	@Query("SELECT u.roleUser FROM User u where  u.id =:id")
	public String getUserRole(@Param("id")int id);
	
	@Query("SELECT CONCAT(u.firstNameUser,CONCAT(' ',u.lastNameUser)) FROM User u where  u.stateUser =TRUE")
	public List<String> getUsersFromActivated();
	
	@Query("SELECT CONCAT(u.firstNameUser,CONCAT(' ',u.lastName)) FROM User u where  u.state =FALSE")
	public List<String> getUsersFromDisabled();
	
	@Query("UPDATE User u SET u.failedAttempt = ?1 WHERE u.firstNameUser = ?2")
    @Modifying
    public void updateFailedAttempts(int failAttempts, String login);
	User findUserByresettoken(String login);

	@Query("SELECT u FROM User u where u.idUser= :id ")
	User findForChatById(@Param("id") int id);
	
	@Query("Select u FROM User u where u.roleUser= :role")
	List<User> findAllByRole(@Param("role") User user);
	
	@Query("SELECT  u From User u WHERE u.roleUser=:role and  u.idUser=:id  ")
	User findDirector(@Param("role") String role,@Param("id") int idUser);
	
}*/
