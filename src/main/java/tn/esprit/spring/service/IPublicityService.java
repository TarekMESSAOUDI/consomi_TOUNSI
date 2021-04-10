package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Publicity;


public interface IPublicityService  {

	public List<Publicity> showAll();
	public void deletePublicity(int id);
	public Publicity updatePublicity(Publicity p);
	public Publicity addPublicity(Publicity p);
	public Publicity GetPublicityById(int id);
	public List<Publicity> GetPublicitiesByName(String name);
	
	
}
