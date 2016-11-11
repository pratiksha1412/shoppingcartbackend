package com.niit.backend;

import org.junit.Assert;
import org.junit.BeforeClass;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;



public class CategoryTestCase {

	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Category category;
      
	@Autowired  
     static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");	
		context.refresh();
		categoryDAO  = (CategoryDAO) context.getBean("categoryDAO");
		category  = (Category) context.getBean("category");
		System.out.println("THE OBJECT ARE CREATED");
	}
      
      // start writing junit test case for all method in DAO
      //
	
	//@SuppressWarnings("deprecation")
	/*@Test
	public void createCategoryTestCase()
	
	{
		category.setId("4");
		category.setDescription("footware");
		category.setName("unisex");
		
		
		
		Boolean status = categoryDAO.save(category);
		Assert.assertEquals("create Category Test Case",true, status);
	}
	*/
	
	@Test
	public void deleteCategoryTestCase()
	{
		category.setId("2");
		Boolean status= categoryDAO.delete(category);
		Assert.assertEquals("Delete Category Test Case",true, status);
	}
	
	
	/*@Test
	public void updateCategoryTestCase()
	{
		
		
		category.setId("3");
		Boolean status= categoryDAO.update(category);
		category.setDescription("this is footware Category");
		//Boolean status = category.update(category);
		Assert.assertEquals("update Category Test Case",true, status);
	}
	
	
	@Test
	public void getCategoryTestCase()
	{
		

		Assert.assertEquals("Delete Category Test Case",null, categoryDAO.get("mod-07"));
		
	}
	
     @Test
	public void getAllCategoryTestCase()
	{
		Assert.assertEquals("get all test cases ",3,categoryDAO.list().size());
	}
	*/
}
