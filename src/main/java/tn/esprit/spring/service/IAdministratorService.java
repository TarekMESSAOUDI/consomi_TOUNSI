package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Administrator;

public interface IAdministratorService {
	
	Administrator addAdministrator(Administrator admin);

	Administrator updateAdministrator(Administrator admin);

	boolean deleteAdministrator(int id);

	Optional<Administrator> retrieveAdministratorById(int idUser);

	
	List<Administrator> retrieveAllAdministrators();

}
