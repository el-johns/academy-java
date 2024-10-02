package com.bptn.course._07_oop;

public class BankSystem {

	public static void main(String[] args) {

		BankAccount testAccount = new BankAccount("98765", 1200.00);
		testAccount.displayAccountInfo();

		BankAccount newTestAccount = new BankAccount("12345", 650.00);
		newTestAccount.displayAccountInfo();

		SavingsAccount myAccount = new SavingsAccount("SAVINGS123", 250.00, 2.5);
		myAccount.applyInterest();
		myAccount.displayAccountInfo();
		
		ChequingAccount myChequingAccount = new ChequingAccount("543678", 550.00, 250.00);
		myAccount.withdraw(300);
		myAccount.displayAccountInfo();

	}

}
