package com.bptn.course._03_FlowControl._04_switch_statement;

import java.util.Scanner;

public class switch_statement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		double billAmount;
		
		
	do {
		
		System.out.println("Welcome to the menu!");
		System.out.println("Please choose an item from the list");
		System.out.println("1. Pizza - $12.99");
		System.out.println("2. Burger - $5.99");
		System.out.println("3. Pasta - $10.99");
		System.out.println("4. Salad - $9.99");
		System.out.println("5. Fries - $2.99");
		System.out.println("6. Exit");
		
	while (choice <= scanner.nextInt());
		
		switch(choice) {
		case 1: System.out.println("You ordered pizza!");
		        billAmount += 15.99;
		        break;
		case 2: System.out.println("You ordered Burger!");
		        break;
		case 3: System.out.println("You ordered Pasta!");
		        break;
		case 4: System.out.println("You ordered Salad!");
		        break;
		case 5: System.out.println("You ordered Fries!");        
		}
	}
	}
}
}
	
