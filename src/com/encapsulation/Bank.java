package com.encapsulation;

//Encapsulation:- Binding of data as a single entity
public class Bank {

	private String name;
	private int accountNumber;
	private double balance;

	void deposit(double balances) {

		balance = balance + balances;
		System.out.println("After deposit:- " + balance);

	}

	void withdraw(double balances) {
		if(balance < balances || balances >= 10000 ) {
			System.out.println("You can withdraw upto 10000 only");
			System.out.println("You do not have enough money");
		}
		else {
			
		balance = balance - balances;
		System.out.println("After withdraw:- " + balance);
		}
	}

	Bank(String names, int accountNumbers, double balances) {
		name = names;
		accountNumber = accountNumbers;
		balance = balances;

	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}