package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Client;

public interface IClientService {
	
	Client addClient(Client client);

	Client updateClient(Client client);

	boolean deleteClient(int id);

	Optional<Client> retrieveClientById(int id);
	
	List<Client> retrieveAllClients();

}
