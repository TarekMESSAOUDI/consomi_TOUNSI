package tn.esprit.spring.service;



import tn.esprit.spring.entities.Claim;

public interface IClaimService {
	
	void addClaim(Claim c);
	
	boolean deleteClaim(int id);
	
	Claim updateClaim(Claim c);

	Claim retrieveClaim(int id);

}
