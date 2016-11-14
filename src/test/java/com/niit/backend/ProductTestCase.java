package com.niit.backend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.config.ApplicationContextConfig;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.User;

public class ProductTestCase {
@Autowired
	static  AnnotationConfigApplicationContext context;
@Autowired
	static Product product;
@Autowired
	static ProductDAO productDAO;
@Before
public  void init() {
	context = new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	productDAO = (ProductDAO) context.getBean("productDAO");
	product = (Product) context.getBean("product");
	System.out.println("the object is cretaed");

	Boolean status =productDAO.save(product);
	Assert.assertEquals("createUserTestCase", true,status);
}
@Test

public void createProductTestCase()
{
	product.setId("w12");
	product.setName("prti1");
	product.setPrice("100");
	product.setCategory_id("12e");
	product.setSupplier_id("13w");
	product.setStock("abc3");
	
	Boolean status= productDAO.save(product);
	Assert.assertEquals("createProductTestCase",true,status);
	
	}
@Test
public void updateProductTestCase()
{
	product.setId("w13");
	product.setName("prti13");
	product.setPrice("100");
	product.setCategory_id("12e");
	product.setSupplier_id("13w");
	product.setStock("abc3");
	
	Boolean status= productDAO.update(product);
	Assert.assertEquals("createProductTestCase",true,status);
	

	}
@Test

public void deleteProductTestCase()
{
	product.setId("w12");
	
	Boolean status= productDAO.delete(product);
	Assert.assertEquals("createProductTestCase",true,status);
	
	}
@Test

public void getUserTestCase()
{
	Assert.assertEquals("getUserTestCase",null,productDAO.get("p2"));
	}

@Test
public void getAllUserTestCase()
{
	Assert.assertEquals("get all test cases",1,productDAO.list().size());
	}
	
}
	

