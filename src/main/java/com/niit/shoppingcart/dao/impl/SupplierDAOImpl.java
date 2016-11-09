/*package com.niit.shoppingcart.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

public class SupplierDAOImpl implements SupplierDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
public Supplier 
}



package com.niit.shoppingcart.dao.impl;

import java.util.List;
import java.util.function.Supplier;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	
	SessionFactory sessionFactory;
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Supplier supplier) {
		try {
			
			if(get(supplier.getId())!=null)
			{
				return false;
			}
				sessionFactory.getCurrentSession().save(supplier);
			
			return true;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}
	@Transactional
	public boolean update(Supplier supplier) {
		try {
			if(get(supplier.getId()) !=null)
			{
				return false;
			}
			sessionFactory.getCurrentSession().update(supplier);
			
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
		
		
	
	}
	
	@Transactional
	public boolean delete(Supplier supplier) {
		try {
			
			if(get(supplier.getId())== null)
					{
				return false;
					}
			sessionFactory.getCurrentSession().delete(supplier);
			
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
		
	}
@Transactional
	public Supplier get(String id) {
		
		return(Supplier) sessionFactory.openSession().get(Category.class,id);
		
		
		
		
	}
@Transactional
	public List<Supplier> list() {
		//select * from category
		String hql="from Supplier";
		//we need to convert this hql to db specific query by using createquery
	Query query=sessionFactory.getCurrentSession().createQuery(hql);
	
	return query.list();
	}
}

public boolean save(Category category) {
	// TODO Auto-generated method stub
	return false;
}

public boolean update(Category category) {
	// TODO Auto-generated method stub
	return false;
}

public boolean delete(Category category) {
	// TODO Auto-generated method stub
	return false;
}

public Category get(String id) {
	// TODO Auto-generated method stub
	return null;
}

}
*/