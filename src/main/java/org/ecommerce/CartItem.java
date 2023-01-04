package org.ecommerce;

public class CartItem {
	private Product productObject; // Having the name and price of product
	int quantity;

	CartItem(Product productObject, int quantity) {
		this.productObject = productObject;
		this.quantity = quantity;
	}

	public double getProductObjectPrice() {
		return this.productObject.productPrice;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public String runCartItemOutput() {
		return productObject.runProductOutput() + "\n" + "Quantity of the product: " + getQuantity();
	}

}
