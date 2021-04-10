package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.SexeType;

public interface IClientService {
	
	Client addClient(Client client);

	Client updateClient(Client client);

	boolean deleteClient(int id);

	Client retrieveClientById(int id);
	
	List<Client> retrieveAllClients();

	List<Client> retrieveClientByRankClient(int rankClient);

	List<Client> retrieveClientByPoint(int pointNumberClient);

	List<Client> retrieveClientByFirstName(String firstNameUser);

	List<Client> retrieveClientByState(boolean stateUser);

	List<Client> retrieveClientByAdress(String adressUser);

	List<Client> retrieveClientByDate(Date birthDateUser);

	List<Client> retrieveClientBySexe(SexeType sexeUser);

	long retrieveClientByCount();



}
