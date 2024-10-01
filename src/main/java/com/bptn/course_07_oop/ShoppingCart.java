package com.bptn.course_07_oop;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}

	// addProductToCart
	public void addProductTocart(Product product, int quantity) {
		if (itemCount <= 4) {
			CartItem newItem = new CartItem(product, quantity);
			items[itemCount] = newItem;
			itemCount++;
			product.reduceStock(quantity);
		} else {
			throw new IllegalArgumentException("Cart Full");
		}
	}

	// showProductsInCart
	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount];
		for (int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];			
		}		
		return currentItems;
	}

}
