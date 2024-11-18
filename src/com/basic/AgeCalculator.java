package com.basic;

public class AgeCalculator {
	
	
	static int birthyear= 2002;
	
	public static void ageCalculator(int birthYear) {
		
		int yourAge = 2024 - birthYear;
	
		if(birthYear > 2024) {
			System.out.println("Bhau paida nhi jhala tu");
		}
		
		else if( birthYear < 1994 ){
			System.out.println("Bhau You are history");
		}
		
		else {
			System.out.println("Your age is " + yourAge);
		}
		
		
	}

}
