package com.bptn.course._06_palindromes;

import java.util.Scanner;

public class palindrome_program {

	public static void main(String[] args) {
		
		System.out.println("Enter string to check for palindrome: ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String reverseInput = ""; //Intializing empty string to store the reverse of the original string
		
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reverseInput += input.charAt(i);
		}
		
		if (input.equals(reverseInput)) {
			System.out.println("Input string is palindrome");
		} else {
			System.out.println("Input string is not palindrome");
		}
		scanner.close();
		
		

	}

}
