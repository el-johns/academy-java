package com.bptn.course._12_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		
		ArrayList<String> myBooks = new ArrayList<>();
		
		myBooks.add("Atomic Habits");
		myBooks.add("Beyond Order");
		myBooks.add("Leading Change");
		
		System.out.println("My favorite books are: " + myBooks);
		
		System.out.println(myBooks.get(0));
		myBooks.remove(1);
		System.out.println(myBooks.getLast());
		
		//Search for Book
		if (myBooks.contains("Atomic")) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not found");
		}
		
		if (myBooks.contains("change".toLowerCase())) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not found");
		}
		
		System.out.println("The size of the list is: " + myBooks.size());
		System.out.println("The last item on the list is: " + myBooks.get(myBooks.size() - 1));

	}

}
