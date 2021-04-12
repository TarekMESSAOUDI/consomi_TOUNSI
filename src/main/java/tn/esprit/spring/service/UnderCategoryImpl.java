
package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.UnderCategory;
import tn.esprit.spring.repository.ProductRepository;
import tn.esprit.spring.repository.UnderCategoryRepository;


@Service
public class UnderCategoryImpl implements IUnderCategory {

	@Autowired
	UnderCategoryRepository UCR;
	@Autowired
	ProductRepository PR;
	
	@Override
	public UnderCategory addUndercategory(UnderCategory uc) {
		return UCR.save(uc);
	}

	@Override
	public void deleteUnderCategory(int idUnderCategory) {
		UCR.deleteById(idUnderCategory);
		
	}

	@Override
	public UnderCategory upadateUndercategory(UnderCategory uc) {
		UnderCategory existingunderCat=UCR.findById(uc.getIdUnderCategory()).orElse(null);
		UCR.findById(uc.getIdUnderCategory());
		existingunderCat.setNameUnderCategory(uc.getNameUnderCategory());
		return 	UCR.save(existingunderCat);
	}

	@Override
	public List<UnderCategory> showAllunderCategories() {
		
			List<UnderCategory> underCategories =(List<UnderCategory>) UCR.findAll();
			return underCategories;
	}

	@Override
	public void assignProductToUnderCategory(int idUnderCategory, int idProduct) {
		UnderCategory undercategory=UCR.findById(idUnderCategory).get();
		Product product=PR.findById(idProduct).get();
		
		product.setUnderCategory(undercategory);
		PR.save(product);
	}

//	@Override
//	public void deassignProductFromUndercaegory(int idUnderCategory, int idProduct) {
//		UnderCategory underCategory=UCR.findById(idUnderCategory).get();
//		
//		int x=underCategory.getProduct().size();
//		for(int index=0; index < x ;index++){
//			if(underCategory.getProduct().get(index).getIdUndercategory()==idProduct){
//				underCategory.getProduct().remove(index);
//			}
//		} 
//		
//	}



}
