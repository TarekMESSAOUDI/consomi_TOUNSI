package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repository.IClientRepository;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientRepository Cr;
	
	@Override
	public Client addClient(Client client) {
		return Cr.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		return Cr.save(client);
	}

	@Override
	public boolean deleteClient(int id) {
		if (Cr.existsById(id)){
			Cr.deleteById(id);
			return true;
		}else
		return false;
	}

	@Override
	public Optional<Client> retrieveClientById(int id) {
		return Cr.findById(id);
	}
	
	
	@Override
	public List<Client> retrieveAllClients() {
		return (List<Client>) Cr.findAll();
	}
	
}
