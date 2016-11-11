package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="supplier")// if the table name is same as class name u no need to specify
@Component


	public class Supplier {
	    @Id
		private String id;
	    
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		
		String name;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		private String address;
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
	}

