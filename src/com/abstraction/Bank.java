package com.abstraction;

public class Bank extends AbstractClass{

	@Override
	int withdraw() {
		int a =100;
		int b = 200;
		return b-a;
	}

	@Override
	int deposit() {
		int a =100;
		int b = 200;
		return b-a;
	}

}
