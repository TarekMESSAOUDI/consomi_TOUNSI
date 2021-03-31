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

import tn.esprit.spring.entities.Administrator;
import tn.esprit.spring.entities.SexeType;
import tn.esprit.spring.repository.IAdministratorRepository;
import tn.esprit.spring.service.IAdministratorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdministratorServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(AdministratorServiceImplTest.class);
	
	@Autowired
	IAdministratorService aS;
	
	@Autowired
	IAdministratorRepository aR;
	
	
	@Test
	public void AddAdministratorTest() throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = dateFormat.parse("2021-03-07");
	Administrator admin = new Administrator("Tarek", "MESSAOUDI", "07480313","0000", "0000", true, "55717442","ariana", date, "tarek","img1", SexeType.Men, "Gestionnaoire", "Super");
	aS.addAdministrator(admin);
	}
	
	@Test
	public void updateAdministratorTest(){
		Administrator admin = aR.findById(10).get();
		admin.setStateUser(false);
		aS.updateAdministrator(admin);
	}
	
	@Test
	public void deleteAdministratorTest(){
		l.info("Administrator deleted"+ aS.deleteAdministrator(12));
	}
	
	@Test
	public void retrieveAdministratorByIdTest() {
	l.info("Administrateur by id : "+aS.retrieveAdministratorById(8));
	}
	
	@Test
	public void retrieveAllAdministratorTest() {
		l.info("Administrators list : "+aS.retrieveAllAdministrators());
	}
}
