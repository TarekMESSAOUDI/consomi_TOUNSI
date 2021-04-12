package tn.esprit.spring.service;

import tn.esprit.spring.entities.ImageUser1;

public interface IImageUserService {

	void affectationImageToClient(int idImageUser, int idUser);
	

	//void affecterImageAClient(int idImageUser, int idUser);
	
	public Iterable<ImageUser1> retreiveAllImage();
	
	

}
