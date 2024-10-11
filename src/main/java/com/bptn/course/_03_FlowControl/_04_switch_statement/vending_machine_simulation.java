package com.bptn.course._03_FlowControl._04_switch_statement;

import java.util.Scanner;

public class vending_machine_simulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double amountToPay = 0.0;
		int customerChoice;
		double totalPrice = 0.0;
		
		System.out.println("Welcome to the vending machine!");
		System.out.println("Available Products:");
		System.out.println("1. Sweets - $4.99");
		System.out.println("2. Chocolate bar $5.99");
		
		do {
			System.out.print("What do you wish to order?" );
			customerChoice = scanner.nextInt();
			
			switch(customerChoice) {
			case 1: System.out.println("How much do you want to pay? ");
			        amountToPay = scanner.nextDouble();
			        if(amountToPay >=4.99) {
			        	System.out.println("Your change is: " +(amountToPay-4.99))
			        } else {
			        	System.out.println("Insufficient Amount");
			        	
			        }
			        System.out.println("Do you wish to continue? (Y/N):");
			        
			}
		}
		

	}

}
