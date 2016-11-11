package com.niit.backend;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Supplier supplier;

	@Autowired
	static SupplierDAO supplierDAO;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		supplier = (Supplier) context.getBean("supplier");
		System.out.println("THE OBJECT ARE CREATED");
	}

	// start writing junit test case for all method in DAO
	//

	// @SuppressWarnings("deprecation")
	// @Test
	public void createSupplierTestCase()

	{
		supplier.setId("4");
		// supplier.setaddress("footware");
		supplier.setName("unisex");
		supplier.setAddress("dheli");

		Boolean status = supplierDAO.save(supplier);
		Assert.assertEquals("createSupplierTestCase", true, status);
	}

	
	 @Test
	 public void deleteSupplierTestCase() 
	 { supplier.setId("2");
	  Boolean status= supplierDAO.delete(supplier);
	  Assert.assertEquals("DeleteSupplierTestCase",true, status); 
	  }
	 
	  
	  @Test
	  public void updateSupplierTestCase() 
	  {
	  
	  
	  supplier.setId("3"); supplier.setName("bigbazar"); //Boolean status=
	  supplierDAO.update(supplier); supplier.setAddress("pune"); //Boolean
	// Boolean status = supplier.update(supplier);
	  Assert.assertEquals("updateSupplierTestCase",true,supplierDAO.update(supplier));
	  }
	  
	  
	  @Test public void getSupplierTestCase() {
	  
	  
	  Assert.assertEquals("Delete supplier Test Case",null,
	supplierDAO.get("mod-07"));
	  
	  }
	  
	  @Test public void getAllSupplierTestCase() { Assert.assertEquals(
	  "get all test cases ",3,supplierDAO.list().size()); }
	 
	

}
