package org.ecommerce;

/**
 * The Product class describes the characteristics of a product
 * that can be made as an object and outputs the data
 * to the console.
 *
 * @author Evgeni Georgiev
 * @version 1.0
 */
public class Product {
	private String productLabel;
	private double productPrice;

	Product(String productLabel, double productPrice) {
		this.productLabel = productLabel;
		this.productPrice = productPrice;
	}

	public String getProductLabel() {
		return this.productLabel;
	}

	public double getProductPrice() {
		return this.productPrice;
	}

	// Method is outputting the data from the constructor in the console.
	public String runProductOutput() {
//		return "Name of the product: " + getProductLabel() + "\n" + "Price of the product: " + getProductPrice();
		return String.format("\nName of the product: %s \nPrice of the product: %s", getProductLabel(), getProductPrice());
	}
}
