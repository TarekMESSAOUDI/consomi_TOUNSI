package tn.esprit.spring.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.DepartmentManager;
import tn.esprit.spring.entities.SexeType;
import tn.esprit.spring.repository.IDepartmentManagerRepository;
import tn.esprit.spring.service.IDepartmentManagerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentManagerServiceImplTest  {
	
	private static final Logger l = LogManager.getLogger(DepartmentManagerServiceImplTest.class);
	
	@Autowired
	IDepartmentManagerService dmS;
	@Autowired
	IDepartmentManagerRepository dmR;
	
	@Test
	public void testAddDepartmentManager() throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = dateFormat.parse("2021-03-08");
	DepartmentManager DepM = new DepartmentManager("Tarek", "MESSAOUDI", "07480313","0000", "0000", true, "55717442","ariana", date, "tarek", "img1", SexeType.Men, 20, 5);
	dmS.addDepartmentManager(DepM);
	}
	
	@Test
	public void updateDepartmentManagerTest(){
		DepartmentManager DepM = dmR.findById(18).get();
		DepM.setCinUser("01000");
		dmS.updateDepartmentManager(DepM);
	}
	
	@Test
	public void deleteDepartmentManagerTest(){
		l.info("Department Manager deleted"+ dmS.deleteDepartmentManager(16));
	}
	
	@Test
	public void retrieveDepartmentManagerTest() {
	l.info("Department Manager : "+dmS.retrieveDepartmentManager(17));
	}
	
	@Test
	public void retrieveAllSubjectTest() {
		l.info("DepartmentManager list : "+dmS.retrieveAllDepartmentManagers());
	}
}
