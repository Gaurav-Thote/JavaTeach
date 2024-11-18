package com.constructor;

public class Product {

	// class variable
	private int id;
	private String name;
	private double price;

	// Constructor:- It is a special method which has
	// same name as class name
	// it does not have any written type
	// it is used to initialize class variable
	// first line of constructor is always super or this

	Product(int id, String name, double price) {
		
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
	
}
