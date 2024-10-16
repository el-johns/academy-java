package com.bptn.course._SelfLed.Week3.Wednesday;

import java.util.HashSet;

public class HashManipulation1 {

	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
		HashSet<String> set = new HashSet<String>();

		set.add("A");
		set.add("B");
		set.add("C");

		// Print the size of the set
		System.out.println("Set size: " + set.size());

		// Use for loop to print the values in the set
		for (String value : set)
			System.out.println("Value: " + value);

		// Use add() method to add a new value to the set
		set.add("D");
		System.out.println("Set after using add(): ");
		for (String value : set)
			System.out.println("Value: " + value);

		// Use remove() method to remove a value from the set
		set.remove("A");
		System.out.println("Set after using remove(): ");
		for (String value : set)
			System.out.println("Value: " + value);

		// Use contains() method to check if the value "C" exists in the set
		set.contains("C");
		System.out.println("Value 'C' exists in the set.");

	}

}
