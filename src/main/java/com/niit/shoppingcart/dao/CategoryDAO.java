package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {

	//CRUD OPERATION
	//create---save
	public boolean save(Category category);
	
	public boolean update(Category category);
	
	public boolean delete(Category category);
	
	public Category get(String Id);
	
	
	public List<Category> list();
	
	
}
