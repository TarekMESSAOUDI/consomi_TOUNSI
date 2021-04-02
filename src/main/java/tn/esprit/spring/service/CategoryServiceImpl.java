package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Category;
import tn.esprit.spring.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired 
	CategoryRepository CR;
	
	@Override
	public Category addCategory(Category c) {
		return CR.save(c);
	}

	@Override
	public void deleteCategry(int idCategory) {
		CR.deleteById(idCategory);
	}

	@Override
	public Category updateCategory(Category c) {
		
		Category existingCat=CR.findById(c.getIdCategory()).orElse(null);
		CR.findById(c.getIdCategory());
		existingCat.setNameCategory(c.getNameCategory());
		return 	CR.save(existingCat);
	
	}

	@Override
	public List<Category> showAll() {
		List<Category> categories =(List<Category>) CR.findAll();
		return categories;
	}

}
