package com.bptn.course._12_arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String [] args) {
		
		// C -> Create
		//ArrayList default reserve storage is 10 items
		ArrayList<String> groceries = new ArrayList<>(); //Restricting the list to a specific type (Type safe)
		
		groceries.add("Milk");
		groceries.add("Bread");
		groceries.add("Eggs");
		
		//R -> Read
		System.out.println("Grocery List: " + groceries);
		System.out.println(groceries.get(2));
		System.out.println(groceries.getFirst());
		
		//U -> Update
		groceries.set(1, "Coffee");
		groceries.set(4,"Sugar");
	}

}

