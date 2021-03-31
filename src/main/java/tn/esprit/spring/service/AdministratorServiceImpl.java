package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Administrator;
import tn.esprit.spring.repository.IAdministratorRepository;


@Service
public class AdministratorServiceImpl implements IAdministratorService {
	
	@Autowired
	IAdministratorRepository Ar;
	
	@Override
	public Administrator addAdministrator(Administrator admin) {
		return Ar.save(admin);
	}

	@Override
	public Administrator updateAdministrator(Administrator admin) {
		return Ar.save(admin);
	}

	@Override
	public boolean deleteAdministrator(int id) {
		if (Ar.existsById(id)){
			Ar.deleteById(id);
			return true;
		}else
		return false;
	}

	@Override
	public Optional<Administrator> retrieveAdministratorById(int idUser) {
		return Ar.findById(idUser);
	}
	
	@Override
	public List<Administrator> retrieveAdministratorByTypeAdmin(String typeAdmin) {
		return Ar.findByTypeAdmin(typeAdmin);
	}
	
	@Override
	public List<Administrator> retrieveAdministratorSpecialityAdmin(String specialityAdmin) {
		return Ar.findBySpecialityAdmin(specialityAdmin);
	}
	
	@Override
	public List<Administrator> retrieveAllAdministrators() {
		return (List<Administrator>) Ar.findAll();
	}

}
