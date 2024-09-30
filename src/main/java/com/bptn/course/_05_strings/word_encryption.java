package com.bptn.course._05_strings;

import java.util.Scanner;

public class word_encryption {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = new String();
		System.out.print("Enter a string: ");
		
		for (char c : scan.nextLine().toCharArray()) { //return the inputed string and transform it to char array
			//check given string must contain only [a-zA-Z\s] values - by ASCII Table
			//Adding a condition that char value must be alphabetical value from ASCII Table
			//ASCII 65 = DEC A, 90 = Z, 97 = a, 122 = z, 32 = " "
			if (((int) c >= 65) && ((int) c <= 90) || ((int) c >= 97) && ((int) c <= 122)) {
				
				switch ((int) c) { //Adding switch to increment every char by one to next char both for upper and lower case char
				
				case 90:
					input += "A";
					break;
					
				case 122:
					input += "a";
					break;
					
				default:
					input += (char) (c + 1);
				}
			}
			//Adding If condition: character value must be alphabetical ASCII Table
			else if ((int) c == 32) { //ASCII code for a space is 32
				input += " ";
			}
			else {
				input += (char) (c);
			}
		}
		System.out.println("Encrypted String: " + input);
		scan.close();
	}
}

/*Understanding how ASCII character conversion to Decimal was a new concept that took time to understand. 
 * Also initializing a returning and input from scanner and transforming to toCharArray without having to go
 *  through that step by step was tough until I learned it can be done with a single line and I will make sure 
 *  to always remember that */
