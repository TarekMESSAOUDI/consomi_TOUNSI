package tn.esprit.spring.service;



//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.repository.ClaimRepository;


@Service
public class ClaimServiceImpl implements IClaimService {

	
	
	
	@Autowired
	ClaimRepository cr;
	

	
	@Override
	public void addClaim(Claim c) {
		
		cr.save(c);
	}

	@Override
	public boolean deleteClaim(int id) {
		if(cr.existsById(id)){
			cr.deleteById(id);
			return true; 
			
		}else
		{return false;}
	}
	
	@Override
	public Claim updateClaim(Claim c){
		
		return cr.save(c);
	}

	@Override
	public Claim retrieveClaim(int id){
		return cr.findById(id) .get();
	}
	
	
	
	
	
}
