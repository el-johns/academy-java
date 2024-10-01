package com.bptn.course_07_oop;

public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
	}

	public void applyInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}

}


