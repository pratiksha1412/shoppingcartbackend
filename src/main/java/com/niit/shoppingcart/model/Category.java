package com.niit.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="category")// if the table name is same as class name u no need to specify
@Component
public class Category {

	//id,name,description
	//these property name better to take same name as fields name in the category table
	@Id
	private String id;
	
	//@Column(name="name") // optioonal if the property name is same as field name in table
	private String name;
	
	//@Column(name="description")//optional
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
