package com.exceptionHandelling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Number");
			int a = sc.nextInt();

			System.out.println("Enter Number");
			int b = sc.nextInt();

			int c = a + b;
			System.out.println(c);
		} catch (InputMismatchException e) {
			System.out.println("Please enter Number only");
		}
	}

}
