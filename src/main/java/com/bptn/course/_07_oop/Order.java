package com.bptn.course._07_oop;

class Order {
	
	private Customer customer;
	private CartItem[] items;
	private double totalAmount;
	
	public Order(Customer customer, CartItem[] items, double totalAmount) {
		this.customer = customer;
		this.items = customer.getCart().showProductsInCart();
	}
	
	public void placeOrder() {
		System.out.println("Order successfuly placed for " + customer.getcustomerName());
		System.out.println("Order Summary: ");
		for (CartItem item:items) {
			System.out.println("\t"+item.getProduct().getproductName()+ "-" + item.getCartQuantity());
		}
		System.out.println("Total Amount: $" + totalAmount);
	}

}
