package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.repository.ISubjectRepository;

@Service
public class SubjectServiceImpl implements ISubjectService {
	
	@Autowired
	ISubjectRepository sR;
	
	@Autowired
	ISubjectService sS;

	@Override
	public Subject addSubject(Subject s,int idSubject) {
		if (sR.existsById(idSubject)){
			return (Subject) sR.findAll();
		}else
			return sR.save(s);
	}

	@Override
	public Subject updateSubject(Subject s) {
		return sR.save(s);
	}

	@Override
	public boolean deleteSubject(int id) {
		if (sR.existsById(id)){
			sR.deleteById(id);
			return true;
		}else
		return false;
		
	}

	@Override
	public Optional<Subject> retrieveSubjectById(int id) {
		return sR.findById(id);
	}

	@Override
	public List<Subject> retrieveAllSubject() {
		// TODO Auto-generated method stub
		return (List<Subject>) sR.findAll();
	}

	@Override
	public List<Subject> retrieveSubjectByTitle(String titleSubject) {
		return (List<Subject>) sR.findByTitleSubject(titleSubject);
	}

	@Override
	public List<Subject> retrieveSubjectByStars(float starsNumberSubject) {
		return (List<Subject>) sR.findByStarsNumberSubjectGreaterThan(starsNumberSubject);
	}

	@Override
	public List<Subject> retrieveSubjectByStarsless(float starsNumberSubject) {
		return (List<Subject>) sR.findByStarsNumberSubjectLessThan(starsNumberSubject);
	}
}
