package com.abstraction;

public class Products implements Product{
	
	// Class Variable
	int id;
	String name;
	double price;
	
	@Override
	public void addProduct() {
		
	}

	@Override
	public void removeProduct() {
		
	}

	@Override
	public void updateProduct() {
		
	}
	
	Products (int id, String name,double price){
		this.id = id;
		this.name = name;
		this.price = price;	
	}

}