package org.ecommerce;

public class Product {
	public String productName;
	public double productPrice;

	Product(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	private String getProductName() {
		return this.productName;
	}

	private double getProductPrice() {
		return this.productPrice;
	}

	public String runProductOutput() {
		return "Name of the product: " + getProductName() + "\n" + "Price of the product: " + getProductPrice();
	}
}
