package com.encapsulation;

import java.util.Scanner;

public class BankRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("***Bank Application***");

		System.out.println("Add account");

		System.out.println("Enter Your Name:- ");
		String name = sc.next();

		System.out.println("Enter your Account Number:- ");
		int accountNumber = sc.nextInt();

		System.out.println("Enter Balance:- ");
		double balance = sc.nextDouble();

		Bank b = new Bank(name, accountNumber, balance);
		
		
		boolean yes = true;

		while (yes) {
			
			System.out.println("1. View acoount");

			System.out.println("2. Deposit Money");

			System.out.println("3. Withdraw Money");

			System.out.println("4. Exit");
			
			System.out.println("Enter your choice:- ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println(b);
				break;

			case 2:
				System.out.println("Enter money for deposit:- ");
				double deposit = sc.nextDouble();
				b.deposit(deposit);
				break;

			case 3:
				System.out.println("Enter money for withdraw:- ");
				double withdraw = sc.nextDouble();
				b.withdraw(withdraw);
				break;

			case 4:
				yes = false;
				break;

			default:
				System.out.println("Invalid choice");
			}

		}

	}

}
//MArksheet generator{
	// name
	 
	
	
