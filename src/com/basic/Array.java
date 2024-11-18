package com.basic;

public class Array {

	public static void main(String[] args) {

		int arr[] = new int[6];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;

		String aryy[] = { "Gaurav", "Kasturi", "Sakshi" };

		System.out.println("Length is " + arr.length);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Value of i is " + i);
			System.out.println(arr[i]);

		}
		for (int i = 0; i < aryy.length; i++) {

			
			System.out.println(aryy[i]);

		}

	}
}