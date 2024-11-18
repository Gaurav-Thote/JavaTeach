package com.basic;

import java.util.Scanner;

public class MethodRun {

	public static void main(String[] args) {
		
		Methods m = new Methods();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		m.addition(a, b);
		
		System.out.println("Enter first number");
		double c = sc.nextDouble();
		
		System.out.println("Enter second number");
		double d = sc.nextDouble();
		
		m.substraction(c, d);
	}

}
