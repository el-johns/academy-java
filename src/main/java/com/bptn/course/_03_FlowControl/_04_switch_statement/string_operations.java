package com.bptn.course._03_FlowControl._04_switch_statement;

import java.util.Scanner;

public class string_operations {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
	       
			String input;
	        int choice = 0;
	        
	        System.out.println("/...String Menu.../");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
        
        
            System.out.println("Enter your option: " );
            int select = scanner.nextInt();
	        
	        do {
	                if (select == 1) {
	                	
	                	String reverseInput = ""; //Intializing empty string to store the reverse of the original string
	                	
	                	System.out.println("Enter a string: ");
	                	Scanner scan = new Scanner(System.in);
                    	input = scan.nextLine();
               
                		for (int i = input.length() - 1; i >= 0; i--) {
                			reverseInput += input.charAt(i);
                		}
                		
                		if (input.equals(reverseInput)) {
                			System.out.println(input + " string is palindrome");
                		} else {
                			System.out.println(input + " is not palindrome");
                		}
                		
	                }    	
	                else if (select == 2) {
	                	Scanner scan = new Scanner(System.in);
	                	System.out.println("Enter word string to reverse: ");
	                	input = scan.nextLine();
	                	String reversedStr = "";
	                	
	                	for (int i = input.length() - 1; i >= 0; i--) {
	                		reversedStr += input.charAt(i);
	                	}
	                	System.out.println("Reversed word: " + reversedStr);
	                	
	                }
	                else if (select == 3) {
	                	Scanner scan = new Scanner(System.in);
	            		
	            	    System.out.println("Enter the string1");
	            	    String str1= scan.nextLine();  
	            	    
	            	    System.out.println("Enter the string2");
	            	    String str2= scan.nextLine();
	         	    
	            	    System.out.println(str1.concat(" " + str2));

	                }
	                else if (select == 4) {
	                	String str1;
	                	String str2;
	                	Scanner scan = new Scanner(System.in);
	            		System.out.println("Enter first word: ");
	            		str1 = scan.nextLine();
	            		
	            		System.out.println("Enter second word: ");
	            		str2 = scan.nextLine();
	          
	            		System.out.println(str1.compareTo(str2));
	                	
	                }
	                else if (select == 5) {
                        String str1;
                        Scanner scan = new Scanner(System.in);
	            		System.out.println("Enter a word:");
	            		str1 = scan.nextLine();
	            		
	            		System.out.println(str1.length());
	                }
	                
	        }
	        while (choice <= 5);
	        scanner.close();
	}
}
	          
	    
	        




