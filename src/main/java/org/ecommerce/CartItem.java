package org.ecommerce;

/**
 * The CartItem class wraps existing product as an item from cart.
 * It can be used to set quantity to that product and sum the total price.
 *
 * @author Evgeni Georgiev
 * @version 1.0
 */
public class CartItem {
	private Product product; // Having the name and price of product
	private int quantity;

	CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public double getProductPrice() {
		return this.product.getProductPrice();
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double sumPriceAndQuantityOfItemsInCart() {
		return getProductPrice() * getQuantity();
	}

	public String runCartItemOutput() {
		return String.format("%s \nQuantity of the product: %s", product.runProductOutput(), getQuantity());
	}

}
