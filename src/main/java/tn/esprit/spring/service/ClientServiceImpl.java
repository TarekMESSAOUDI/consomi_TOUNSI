package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Department;
import tn.esprit.spring.entities.ImageUser1;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.SexeType;
import tn.esprit.spring.repository.IClientRepository;
import tn.esprit.spring.repository.IImageUserRepository;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientRepository Cr;
	
	@Autowired
	IImageUserRepository iur;
	
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
	public Client retrieveClientById(int id) {
		return Cr.findById(id).get();
	}
	
	
	@Override
	public List<Client> retrieveAllClients() {
		return (List<Client>) Cr.findAll();
	}

	@Override
	public List<Client> retrieveClientByRankClient(int rankClient) {
		return (List<Client>) Cr.findByRankClient(rankClient);
	}
	
	@Override
	public List<Client> retrieveClientByPoint(int pointNumberClient) {
		return (List<Client>) Cr.findByPointNumberClientGreaterThan(pointNumberClient);
	}
	
	@Override
	public List<Client> retrieveClientByFirstName(String firstNameUser) {
		return (List<Client>) Cr.findByFirstNameUser(firstNameUser);
	}

	@Override
	public List<Client> retrieveClientByState(boolean stateUser) {
		return (List<Client>) Cr.findByStateUser(stateUser);
	}

	@Override
	public List<Client> retrieveClientByAdress(String adressUser) {
		return (List<Client>) Cr.findByAdressUser(adressUser);
	}

	@Override
	public List<Client> retrieveClientByDate(Date birthDateUser) {
		return (List<Client>) Cr.findByBirthDateUser(birthDateUser);
	}
	
	@Override
	public List<Client> retrieveClientBySexe(SexeType sexeUser) {
		return (List<Client>) Cr.findBySexeUser(sexeUser);
	}

	@Override
	public long retrieveClientByCount() {
		return Cr.count();
	}
	
	/*@Override
	public void affectImageToClient(int idUser, int idImageUser) {
	ImageUser1 imageUser1 = iur.findById(idImageUser).get();
	Client client = Cr.findById(idUser).get();
	client.setImageUser1(imageUser1);
	iur.save(imageUser1);

	}*/
	
}
