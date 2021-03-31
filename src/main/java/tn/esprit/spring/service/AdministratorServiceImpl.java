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
		// TODO Auto-generated method stub
		return Ar.save(admin);
	}

	@Override
	public Administrator updateAdministrator(Administrator admin) {
		// TODO Auto-generated method stub
		return Ar.save(admin);
	}

	@Override
	public boolean deleteAdministrator(int id) {
		if (Ar.existsById(id)){
			Ar.deleteById(id);
			return true;
		}else
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Administrator> retrieveAdministrator(int id) {
		// TODO Auto-generated method stub
		return Ar.findById(id);
	}

	@Override
	public List<Administrator> retrieveAllAdministrators() {
		// TODO Auto-generated method stub
		return (List<Administrator>) Ar.findAll();
	}

}
