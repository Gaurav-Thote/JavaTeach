package com.basic;

import java.util.Scanner;

public class AgeCalculatorRun {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Birth Year");
		int birthYear = sc.nextInt();
		
		AgeCalculator.ageCalculator(birthYear); 
		
		
		
	}

}
