package com.bptn.course._03_FlowControl._04_switch_statement;

import java.util.Scanner;

public class select_shoe_size {

	public static void main(String[] args) {
		
		int customerSize = 0;
		String size;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our shoe store!");
		System.out.println("Available shoe sizes listed below: ");
		System.out.println("30, 41, 44, 45");
		System.out.println("Enter your shoe size: ");
		customerSize = scanner.nextInt();


		// switch statement to select shoe size
		switch (customerSize) {

	  	case 30:
	    	size = "Small";
	    	break;

	  	case 41:
	    	size = "Medium";
	    	break;

	  	case 44:
	    	size = "Large";
	    	break;

	  	case 45:
	    	size = "Extra Large";
	    	break;
	 	 
	  	default:
	    	size = "Not available at this time. Try our other stores in different locations. Thank you!";
	    	break;


		}
		System.out.println("Size: " + size);
		
		scanner.close();


	}

}
