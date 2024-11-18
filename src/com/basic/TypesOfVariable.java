package com.basic;

public class TypesOfVariable {
	//Class variable:- It is loaded in memory whenever
	//an new object created 
	int classVariable;
	
	
//	Static variable :- Single copy is created in memory
	static int staticVariable;
	
	void variable() {
//Local variable:- It is loaded in memory whenever an 
//	method is called and gets destroyed when method 
//	completes its execution
		
		int localVariable = 10;
		System.out.println("Class Variable = "+ ++classVariable);
		
		System.out.println("Static Varaible = " + ++staticVariable);
		
		System.out.println("Local Varaible = " + ++localVariable);
		
	}
	
	TypesOfVariable(int a, int b){
		
		classVariable = a;
		staticVariable = b;
	}
	
	
}
