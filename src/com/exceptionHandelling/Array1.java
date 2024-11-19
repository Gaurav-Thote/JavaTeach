package com.exceptionHandelling;

//Exception :- It stops the further execution of code
public class Array1 {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		try {
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
			System.out.println(arr[5]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("6 th element is not there you cannot print it");
		}
		
		System.out.println("Bye bye");

	}

}
