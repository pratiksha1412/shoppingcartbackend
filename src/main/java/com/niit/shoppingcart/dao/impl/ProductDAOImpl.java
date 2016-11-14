package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory =  sessionFactory;
	}
@Transactional
	public Boolean save(Product product) {
		
		try {
			
			if(get(product.getId())!= null)
			{
			return false;
			}
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	public Boolean update(Product product) {
		
		try {
			
			if(get(product.getId())!=null)
			{
			return false;
			}
			sessionFactory.getCurrentSession().update(product);
			return true;
			} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	public Boolean delete(Product product) {
		
		try {
			if(get(product.getId())==null)
			{
			return null;
			}
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	public Product get(String id) {
		
		return(Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}
@Transactional
	public List<Product> list() {
		String hql="from Product";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
}
