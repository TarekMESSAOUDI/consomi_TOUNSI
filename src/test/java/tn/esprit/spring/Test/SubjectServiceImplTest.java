package tn.esprit.spring.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.entities.Subject;
import tn.esprit.spring.repository.ISubjectRepository;
import tn.esprit.spring.service.ISubjectService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(SubjectServiceImplTest.class);
	
	@Autowired
	ISubjectService sS;
	
	@Autowired
	ISubjectRepository sR;
	
	@Test
	public void addSubjectTest() {
	Subject s = new Subject("TitreSujet","EvenementA",4);
	sS.addSubject(s,1);
	}
	
	@Test
	public void updateSubjectTest(){
		Subject s = sR.findById(2).get();
		s.setStarsNumberSubject(7);
		sS.updateSubject(s);
	}
	
	@Test
	public void deleteSubjectTest(){
		l.info("Subject deleted"+ sS.deleteSubject(1));
	}

	@Test
	public void retrieveSubjectByIdTest() {
		l.info("Subject by id:"+sS.retrieveSubjectById(3));
	}
	
	@Test
	public void retrieveAllSubjectTest() {
		l.info("Subject list : "+sS.retrieveAllSubject());
	}

}
