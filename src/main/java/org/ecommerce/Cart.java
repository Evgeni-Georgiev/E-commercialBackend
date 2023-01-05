package org.ecommerce;

import java.util.ArrayList;

/**
 * The Cart class used to add delivery fee and VAT to the items from the Cart.
 *
 * @author Evgeni Georgiev
 * @version 1.0
 */
public class Cart {
	private ArrayList<CartItem> cartItems = new ArrayList<>();
	private double deliveryFee;
	private double sumTotalPriceOfProductsInCart;

	public double getDeliveryFee() {
		return this.deliveryFee;
	}

	public void setDeliveryFee(double sumTotalPriceOfProductsInCart) {
		if(sumTotalPriceOfProductsInCart < 100) {
			deliveryFee = 10;
		} else if(sumTotalPriceOfProductsInCart < 200 && sumTotalPriceOfProductsInCart > 100) {
			deliveryFee = 5;
		} else if(sumTotalPriceOfProductsInCart > 200) {
			deliveryFee = 0;
		}
	}
	public void addAllCartItems(CartItem cartItem) {
		cartItems.add(cartItem);
	}

	public double getSumTotalPriceOfProductsInCart() {
		return this.sumTotalPriceOfProductsInCart;
	}

	public String runSumTotalSumOfAllItemsInCart() {
		for (CartItem element : cartItems) {
			this.sumTotalPriceOfProductsInCart += element.sumPriceAndQuantityOfItemsInCart();
		}
		return String.format(
			"\nTotal sum: %s" +
			"\nVAT: %s" +
			"\nDelivery Fee: %s" +
			"\nTotal sum of all items in Cart with VAT: %s",
			(this.sumTotalPriceOfProductsInCart ), runCalculateVAT(), getDeliveryFee(), (this.sumTotalPriceOfProductsInCart + runCalculateVAT() + getDeliveryFee() )
		);
	}

	private double runCalculateVAT() {
		return this.sumTotalPriceOfProductsInCart * 0.2;
	}

	public void runCartOutput() {
		for (CartItem element : cartItems) {
			System.out.println(element.runCartItemOutput() + "\n" +
				"Delivery Fee: " + getDeliveryFee() + "\n" +
				"Every item: " + element.sumPriceAndQuantityOfItemsInCart() + "\n"
				+ "-------------------------");
		}
	}

}
