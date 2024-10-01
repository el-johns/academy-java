package com.bptn.course_07_oop;

class BankAccount {

	// Data members/Properties of the class/Attributes. 
	//Cannot be accessed outside of the class, only objects of the class can access them b'cos they're private
	private String accountNumber;
	private double balance;

	// Constructor: initialize members to give them value
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	// Instance Method/Class Method/Behavior of the class
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance += amount;
		}
	}

	// Getters and Setters
	public double getBalance() {
		return balance;
	}

	public void displayAccountInfo() {
		System.out.println("Acount Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
	}

}
