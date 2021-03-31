package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.repository.ISubjectRepository;

@Service
public class SubjectServiceImpl implements ISubjectService {
	
	@Autowired
	ISubjectRepository sR;

	@Override
	public Subject addSubject(Subject s) {
		// TODO Auto-generated method stub
		return sR.save(s);
	}

	@Override
	public Subject updateSubject(Subject s) {
		// TODO Auto-generated method stub
		return sR.save(s);
	}

	@Override
	public boolean deleteSubject(int id) {
		if (sR.existsById(id)){
			sR.deleteById(id);
			return true;
		}else
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Subject> retrieveSubject(int id) {
		// TODO Auto-generated method stub
		return sR.findById(id);
	}

	@Override
	public List<Subject> retrieveAllSubject() {
		// TODO Auto-generated method stub
		return (List<Subject>) sR.findAll();
	}

}
