package com.bptn.course._07_oop;

class Customer {
	//Instance variables, they are private to this class, cannot be accessed (read/altered) by outside objects
	private String customerID;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;
	
	public Customer(String customerID, String customerName, String customerEmail) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cart = new ShoppingCart();
	}
	
	//Getter for customerName: provides a safe way to get the value of this instance variable from outside of this class
	public String getcustomerName() {
		return this.customerName;
	}
	
	//Getter for cart
	public ShoppingCart getCart() {
		return this.cart;
	}
	
	public void checkout() {
		System.out.println("Processing order for " + customerName + "...");
	}
	

}

/* setters provide a scripted way to change the value of instance variables */