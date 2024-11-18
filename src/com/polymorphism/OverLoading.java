package com.polymorphism;

//1. Compile time polymorphism or overloading:- In overloading method name is same
//				but parameters are different 
//				if parameters are same then their order should be different.

public class OverLoading {

	int add() {
		int x = 10;
		int y = 20;
		return x + y;
	}

	int add(int x, int y) {

		return x + y;
	}

	double add(int x, int y, double d) {

		return x + y + d;
	}

	double add(int x, double d, int y) {

		return x + y + d;
	}
	double add(double d, int x,  int y) {

		return x + y + d;
	}
}
