package com.constructor;


// Constructor:- It is a special method which has
// same name as class name
// it does not have any written type
// it is used to initialize class variable
// first line of constructor is always super or this
// it is called when an object is created

public class ConstructorChaining extends Constructor{

	public ConstructorChaining() {
	
		super();
		System.out.println("Constructor with no paramerter");
		
	}
	public ConstructorChaining(int a) {
		
		this();
		System.out.println("Constructor with 1 paramerter");
		
	}
	
	public ConstructorChaining(int a, int b , int c) {
		
		this(a, b);
		System.out.println("Constructor with 3 paramerter");
		
	}
	public ConstructorChaining(int a , int b) {

		this(a);
		System.out.println("Constructor with 2 paramerter");
		
	}
}
