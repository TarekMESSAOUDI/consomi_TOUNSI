package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Category;

public interface ICategoryService {

	
	public Category addCategory(Category c);
	public void deleteCategry(int idCategory);
	public Category updateCategory(Category c);
	public List<Category> showAll();
}	
