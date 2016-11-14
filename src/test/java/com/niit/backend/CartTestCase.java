package com.niit.backend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Product;

public class CartTestCase {
@Autowired
	static  AnnotationConfigApplicationContext context;
	@Autowired
	static Cart cart;
	@Autowired
	static CartDAO cartDAO;
	
	@Before
	public  void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		cartDAO = (CartDAO) context.getBean("cartDAO");
		cart = (Cart) context.getBean("cart");
		System.out.println("the object is cretaed");

		Boolean status =cartDAO.save(cart);
		Assert.assertEquals("createCartTestCase", true,status);
	}
	@Test
	public void createCartTestCase()
	{
		cart.setId("w12");
		cart.setQuantity("prti1");
		cart.setPrice("100");
		cart.setProduct_id("12e");
		
		Boolean status= cartDAO.save(cart);
		Assert.assertEquals("createcartTestCase",true,status);
		
		}
	@Test
	
	public void updateCartTestCase()
	{
		cart.setId("w12");
		cart.setQuantity("fg");
		cart.setPrice("150");
		cart.setProduct_id("2e");
		
		Boolean status= cartDAO.update(cart);
		Assert.assertEquals("createcartTestCase",true,status);
		
		}
	
	@Test
	public void deleteCartTestCase()
	{
		cart.setId("w12");
		
		Boolean status= cartDAO.delete(cart);
		Assert.assertEquals("createcartTestCase",true,status);
		
		}
	@Test
	public void getCartTestCase()
	{
		Assert.assertEquals("getUserTestCase",null,cartDAO.get("p2"));
		}

	@Test
	public void getAllCartTestCase()
	{
		Assert.assertEquals("get all test cases",1,cartDAO.list().size());
		}
	
	

}
