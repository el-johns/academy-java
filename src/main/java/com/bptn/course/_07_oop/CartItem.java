package com.bptn.course._07_oop;

class CartItem {

	private Product product;
	private int cartQuantity;

	public CartItem(Product product, int quantity) {

		if (quantity > product.getproductQuantity()) {
			throw new IllegalArgumentException("Insufficient Stock");
		}

		this.product = product;
		this.cartQuantity = quantity;
	}

	// Getters/ Accessors: seperates the customer request from product availability
	// on the system
	public Product getProduct() {
		return this.product;
	}

	public int getCartQuantity() {
		return this.cartQuantity;
	}

	public double getTotalPrice() {
		return this.product.getproductPrice() * this.cartQuantity;
	}

}
