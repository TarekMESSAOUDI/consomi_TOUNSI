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

import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.SexeType;
import tn.esprit.spring.repository.IClientRepository;
import tn.esprit.spring.service.IClientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {
	
	private static final Logger l = LogManager.getLogger(ClientServiceImplTest.class);
	
	@Autowired
	IClientService cS;
	
	@Autowired
	IClientRepository cR;
	
	@Test
	public void testAddClient() throws ParseException {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = dateFormat.parse("2021-03-07");
	Client client = new Client("Tarek", "MESSAOUDI", "07480313","0000", "0000", true, "55717442","ariana", date, "tarek", "img1", SexeType.Men, 1,1,0);
	cS.addClient(client);
	}
	
	@Test
	public void updateClientTest(){
		Client client = cR.findById(9).get();
		client.setStateUser(false);
		cS.updateClient(client);
	}

	@Test
	public void deleteClientTest(){
		l.info("Client deleted"+ cS.deleteClient(13));
	}
	
	@Test
	public void retrieveClientByIdTest() {
	l.info("Client : "+cS.retrieveClientById(11));
	}
		
	@Test
	public void retrieveAllClientTest() {
		l.info("Clients list : "+cS.retrieveAllClients());
	}
	
}
