package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.UnderCategory;



public interface IUnderCategory {
public UnderCategory addUndercategory(UnderCategory uc);
public void deleteUnderCategory(int idUnderCategory);
public UnderCategory upadateUndercategory(UnderCategory uc);
public List<UnderCategory> showAllunderCategories();

}
