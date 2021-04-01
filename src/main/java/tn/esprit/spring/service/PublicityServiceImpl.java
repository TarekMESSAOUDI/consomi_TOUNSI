package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entities.Publicity;
import tn.esprit.spring.repository.PublicityRepository;



@Service
public class PublicityServiceImpl implements IPublicityService {

	@Autowired
	PublicityRepository publicityRepository;
	
	
	
	
	private static final Logger L = LogManager.getLogger(IPublicityService.class);
	
	@Override  //done
	public List<Publicity> showAll() {
	 List<Publicity> publicities=(List<Publicity>) publicityRepository.findAll();
	 for (Publicity p :publicities){
		 L.info("Publicity+++"+p);
		 System.out.println(p);
	 }
		 return publicities;
	
	}

	
	@Override //done
	public void deletePublicity(int id) {
		if (publicityRepository.existsById(id))
		{
		publicityRepository.deleteById(id);
		}
		else System.out.println("Publicity with id:"+id+" Does Not exist");
		
	}

	

	@Override  //done
	public Publicity updatePublicity(Publicity p) {
		Publicity existingPub=publicityRepository.findById(p.getIdPublicity()).orElse(null);
		existingPub.setNamePublicity(p.getNamePublicity());
		existingPub.setStartDatePublicity(p.getStartDatePublicity());
		existingPub.setTargetPublicity(p.getTargetPublicity());
		existingPub.setChannelPublicity(p.getChannelPublicity());
		existingPub.setCostPublicity(p.getCostPublicity());
		existingPub.setMailOwnerPublicity(p.getMailOwnerPublicity());
		existingPub.setPhoneOwnerPublicity(p.getPhoneOwnerPublicity());
		existingPub.setDescriptionPublicity(p.getDescriptionPublicity());
		existingPub.setInitialViewNumber(p.getInitialViewNumber());
		existingPub.setFinalViewNumber(p.getFinalViewNumber());
		existingPub.setTypePublicity(p.getTypePublicity());
		existingPub.setEndDatePublicity(p.getEndDatePublicity());
		
		
		return publicityRepository.save(existingPub);
	}

 
	@Override //done
	public Publicity GetPublicityById(int id) {
		return publicityRepository.findById(id).orElse(null);
	}


	@Override //done
	public List<Publicity> GetPublicitiesByName(String name) {
		List<Publicity> pubs =(List<Publicity>) publicityRepository.findAllByNamePublicity(name);
		for (Publicity pub : pubs){
			L.info("Product +++ :" + pub);
		}
		return pubs;
	}


	@Override //done
	public Publicity addPublicity(Publicity p) {
		publicityRepository.save(p);
		return p;
	}



		
	

}
