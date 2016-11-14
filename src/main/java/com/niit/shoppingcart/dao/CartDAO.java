package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Product;

public interface CartDAO {
	public Boolean save(Cart cart);
	public Boolean update(Cart cart);
	public Boolean delete(Cart cart);
	public Cart get(String id);
	public List <Cart> list();

}
