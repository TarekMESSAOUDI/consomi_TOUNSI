package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.DepartmentManager;
import tn.esprit.spring.repository.IDepartmentManagerRepository;

@Service
public class DepartmentManagerServiceImpl implements IDepartmentManagerService {
	
	@Autowired
	IDepartmentManagerRepository Dmr;

	@Override
	public DepartmentManager addDepartmentManager(DepartmentManager DepM) {
		// TODO Auto-generated method stub
		return Dmr.save(DepM);
	}

	@Override
	public DepartmentManager updateDepartmentManager(DepartmentManager DepM) {
		// TODO Auto-generated method stub
		return Dmr.save(DepM);
	}

	@Override
	public boolean deleteDepartmentManager(int id) {
		// TODO Auto-generated method stub
		if (Dmr.existsById(id)){
			Dmr.deleteById(id);
			return true;
		}else
		return false;
	}

	@Override
	public Optional<DepartmentManager> retrieveDepartmentManager(int id) {
		// TODO Auto-generated method stub
		return Dmr.findById(id);
	}

	@Override
	public List<DepartmentManager> retrieveAllDepartmentManagers() {
		// TODO Auto-generated method stub
		return (List<DepartmentManager>) Dmr.findAll();
	}

}
