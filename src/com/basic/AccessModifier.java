package com.basic;

public class AccessModifier {

	//public :- visibility is through out the project
	//private:- visibility is in same class
	//default:- visibility is in the same package
	//protected :- visibility is same package and outside package in child class
	
	public int publicVariable = 20;
	private int privateVariable = 30;
	int defaultVariable = 40;
	protected int protectedVariable = 50;
		
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
	
		System.out.println(am.defaultVariable);
		System.out.println(am.privateVariable);
		System.out.println(am.protectedVariable);
		System.out.println(am.publicVariable);
	
	}	
}