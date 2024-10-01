package com.bptn.course_07_oop;

public class ShoppingCartApp {

	public static void main(String args[]) {

		Product P1 = new Product("P001", "Laptop", 1500, 100);
		Product P2 = new Product("P002", "Smartphone", 200, 150);

		Customer customer = new Customer("C001", "TestCustomer", "test@allcustomer.com");

		customer.getCart().addProductTocart(P1, 1);
		customer.getCart().addProductTocart(P2, 2);

		customer.checkout();

		Order order = new Order(customer, null, 0);
		order.placeOrder();
	}

}
