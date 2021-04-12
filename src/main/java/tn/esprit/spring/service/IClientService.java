package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.SexeType;
import tn.esprit.spring.entities.User;

public interface IClientService {
	
	Client addClient(Client client);

	Client updateClient(Client client);

	boolean deleteClient(int id);

	Client retrieveClientById(int id);
	
	List<Client> retrieveAllClients();

	List<Client> retrieveClientByRankClient(int rankClient);

	List<Client> retrieveClientByPoint(int pointNumberClient);

	Client retrieveClientByFirstName(String firstNameUser);

	List<Client> retrieveClientByState(boolean stateUser);

	List<Client> retrieveClientByAdress(String adressUser);

	List<Client> retrieveClientByDate(Date birthDateUser);

	List<Client> retrieveClientBySexe(SexeType sexeUser);

	long retrieveClientByCount();
	
	//public List<User> getAllUsers();
	//public User getUserById(int id) throws Exception;
 	public Client activateUser (Client user) throws Exception;
	public Client desactivateUser (Client user) throws Exception;
	public Client createUser(Client entity) throws Exception;
	public Client updateUser(Client entity) throws Exception;
	public void deleteUserById(Integer userId) throws Exception;
	public Client findUserByfirstNameUser(String user) throws Exception;
	//public List<Client> findUserLastName(String user) throws Exception;
	public String getUserRoleDescription(int id);
	public List<String> findUsersActivated() throws Exception;	
	public List<String> getUsersFromDisabled();
	public void increaseFailedAttempts(Client user);
	boolean unlockWhenTimeExpired(Client user);
	void resetFailedAttempts(String email);
	void lock(Client user);
	public Client findUserByResetToken(String token);

	Client findById(int id);
	Client findBymail(String mail);

	//void increaseFailedAttempts(Client user);



}
