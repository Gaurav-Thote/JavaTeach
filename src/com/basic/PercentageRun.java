package com.basic;

import java.util.Scanner;

public class PercentageRun {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter maths marks:- ");
		int maths = sc.nextInt();
		
		System.out.println("Enter science marks:- ");
		int science = sc.nextInt();
		
		System.out.println("Enter english marks:- ");
		int english = sc.nextInt();
		
		Percentage p = new Percentage(maths, science, english);
		
	}

}
