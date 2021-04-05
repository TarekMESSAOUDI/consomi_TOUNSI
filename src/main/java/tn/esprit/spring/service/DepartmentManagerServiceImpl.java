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
		return Dmr.save(DepM);
	}

	@Override
	public DepartmentManager updateDepartmentManager(DepartmentManager DepM) {
		return Dmr.save(DepM);
	}

	@Override
	public boolean deleteDepartmentManager(int id) {
		if (Dmr.existsById(id)){
			Dmr.deleteById(id);
			return true;
		}else
		return false;
	}

	@Override
	public Optional<DepartmentManager> retrieveDepartmentManagerById(int id) {
		return Dmr.findById(id);
	}

	@Override
	public List<DepartmentManager> retrieveAllDepartmentManagers() {
		return (List<DepartmentManager>) Dmr.findAll();
	}

	@Override
	public List<DepartmentManager> retrieveDepartmentManagerBysalary(float salaryDepartmentManager) {
		return (List<DepartmentManager>) Dmr.findBySalaryDepartmentManagerGreaterThan(salaryDepartmentManager);
	}

	@Override
	public long retrieveDepartmentManagerByCount() {
		return Dmr.count();
	}
}
