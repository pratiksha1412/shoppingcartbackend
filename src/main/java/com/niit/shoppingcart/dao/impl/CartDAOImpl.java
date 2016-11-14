package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Category;
@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	@Autowired
	SessionFactory sessionFactory;
	public CartDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public Boolean save(Cart cart) {
		
		try {
			if(get(cart.getId())!=null)
			{
			return false;
			}
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public Boolean update(Cart cart) {
		
		try {
			
			if(get(cart.getId())!=null)
			{
			return null;
			}
			sessionFactory.getCurrentSession().update(cart);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
			return false;
			
		}
	}
	@Transactional
	public Boolean delete (Cart cart) {
		// TODO Auto-generated method stub
		try {
			
			if(get(cart.getId())==null)
			{
			return false;
			}
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public Cart get(String id) {
		// TODO Auto-generated method stub
		return (Cart) sessionFactory.openSession().get(Cart.class,id);
	}
	@Transactional
	public List<Cart> list() {
		
		String hql="from Cart";
		//we need to convert this hql to db specific query by using createquery
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
	return query.list();
	
	
	}
	

}
