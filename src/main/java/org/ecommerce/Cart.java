package org.ecommerce;

import java.util.ArrayList;

public class Cart {
	public ArrayList<CartItem> cartItems = new ArrayList<>();
	public double deliveryFee;
	public double sumTotalPriceOfProductsInCart;

	public double deliveryFee() {
		return this.deliveryFee;
	}

	public void addAllCartItems(CartItem cartItem) {
		cartItems.add(cartItem);
	}

	public double sumPriceAndQuantityOfItemsInCart(CartItem element) {
		return element.getProductObjectPrice() * element.getQuantity();
	}

	public void runCartOutput() {
		for (CartItem element : cartItems) {
			System.out.println(element.runCartItemOutput() + "\n" + "Delivery Fee: " + deliveryFee() + "\n" + "Every item: " + sumPriceAndQuantityOfItemsInCart(element) + "\n" + "-------------------------");
		}
	}

	public String runSumTotalSumOfAllItemsInCart() {
		for (CartItem element : cartItems) {
			this.sumTotalPriceOfProductsInCart += sumPriceAndQuantityOfItemsInCart(element);
		}
		return "Total sum of all items in Cart: " + this.sumTotalPriceOfProductsInCart;
	}

	public double calculateDDS() {
		return (this.sumTotalPriceOfProductsInCart * 0.2);
	}

}
