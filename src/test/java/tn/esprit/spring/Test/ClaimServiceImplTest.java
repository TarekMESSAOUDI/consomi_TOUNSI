package tn.esprit.spring.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.repository.ClaimRepository;
import tn.esprit.spring.service.IClaimService;


@RunWith(SpringRunner.class)
@SpringBootTest


public class ClaimServiceImplTest {
	
	
	private static final Logger l = LogManager.getLogger(ClaimServiceImplTest.class);
	
	
  @Autowired
  IClaimService cs;
  @Autowired
  ClaimRepository cr;
  @Test 
  public void AddClaimTest(){
	  
	  Claim c= new Claim(1,"manque de produit","Nader Hajji",null,null);
	  cs.addClaim(c);
	  Claim n=new Claim(2,"kkfodfl","lmpppezp",null,null);
	  cs.addClaim(n);
  }
  
  @Test
  public void deleteClaimTest() 
  {
	  
	    l.debug("claim deleted:"+ cs.deleteClaim(2));
	    
	    
  }
  
  
  @Test 
  public void updateClaim(){
	Claim c=cr.findById(4).get();
	  
	  c.setIdClaim(4);
	  cs.addClaim(c);
  }
  
  
  @Test
	public void retrieveClaimTest() {
	cs.retrieveClaim(3);
	}
  
 
}