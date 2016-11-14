package com.niit.backend;

import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;




public class UserTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static User user;

	@Autowired
	static UserDAO userDAO;
	
@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
		System.out.println("the object is cretaed");

	}
	
	
	
@Test
	public void createUserTestCase() {
		user.setId("4ee");
		user.setPassword("abc1");
		user.setName("ganpati2");
		user.setRole("custome3r");
		user.setContact("pune4");
		
		
		Boolean status =userDAO.save(user);
		Assert.assertEquals("createUserTestCase", true,status);
	}


@Test
public void deleteUserTestCase()
{
	user.setId("p4");
	Boolean status= userDAO.delete(user);
	Assert.assertEquals("deleteUserTestCase",true,status);
}

@Test
public void updateUserTestCase()
{
	user.setId("4ee");
	Boolean status = userDAO.update(user);
	user.setName("prati0");
	user.setPassword("sda4");
	user.setRole("customer3");
	user.setContact("pune4");
	
	
	Assert.assertEquals("updateUserTestCase",true,status);
	}

@Test
public void getUserTestCase()
{
	Assert.assertEquals("getUserTestCase",null,userDAO.get("p2"));
	}

@Test
public void getAllUserTestCase()
{
	Assert.assertEquals("get all test cases",1,userDAO.list().size());
	}
	
}
