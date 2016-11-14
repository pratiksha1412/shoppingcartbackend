package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDAO {
public Boolean save(Product product);
public Boolean update(Product product);
public Boolean delete(Product product);
public Product get(String id);
public List <Product> list();
}
