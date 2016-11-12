/*package com.niit.shoppingcart.dao.impl;

import java.util.List;
import java.util.function.Supplier;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.SupplierDAO;


@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	 SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Supplier supplier) {

		// TODO Auto-generated method stub
		try {
			if (get(supplier.getId())!=null) {
				return false;
			}
			sessionFactory.openSession().save(supplier);

			return true;
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			if (get(supplier.getId())!= null) {
				return false;
			}
			sessionFactory.openSession().update(supplier);

			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			if (get(supplier.getId()) == null) {
				return false;
			}
			sessionFactory.openSession().delete(supplier);

			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Supplier get(String id) {
		// TODO Auto-generated method stub
		return (Supplier) sessionFactory.openSession().get(Supplier.class, id);

	}

	@Transactional
	public List<Supplier> list() {
		// TODO Auto-generated method stub
		String hql = "from Supplier";
		Query query = sessionFactory.openSession().createQuery(hql);

		return query.list();

	}


	public boolean save(Supplier supplier) {
		
		// TODO Auto-generated method stub
		try {
			
			if(get(supplier.get())!= null){
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

	public boolean update (Supplier supplier) {
		// TODO Auto-generated method stub
		
		
		try {
			
			if(get(suplier.getId())!=null){
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

	public boolean delete(Supplier supplier) {
		// TODO Auto-generated method stub
		try {
			
			if(get(supplier.getId())==null){
			return false;
			}
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
	}

	public Supplier get(String id) {
		// TODO Auto-generated method stub
		return(Supplier) sessionFactory.getCurrentSession().get(Supplier.class,id);
	}

	public List<Supplier> list() {
		// TODO Auto-generated method stub
          String hql="from Supplier";
          Query query= sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	public boolean update(Supplier supplier) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
I*/