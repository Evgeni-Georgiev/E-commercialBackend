package org.ecommerce;

public class Application {
	public static void main(String[] args) {

		Product apple = new Product("Apple", 13.00);
		Product banana = new Product("Banana", 17.00);
		Product kiwi = new Product("Kiwi", 3.00);
		Product orange = new Product("Orange", 7.00);

		CartItem appleItem = new CartItem(apple, 5);
		CartItem bananaItem = new CartItem(banana, 15);
		CartItem kiwiItem = new CartItem(kiwi, 25);
		CartItem orangeItem = new CartItem(orange, 45);

		Cart itemsInCart = new Cart();
		itemsInCart.addAllCartItems(appleItem);
		itemsInCart.addAllCartItems(bananaItem);
		itemsInCart.addAllCartItems(kiwiItem);
		itemsInCart.addAllCartItems(orangeItem);

		itemsInCart.setDeliveryFee(itemsInCart.getSumTotalPriceOfProductsInCart());
		itemsInCart.runCartOutput();
		System.out.println(itemsInCart.runSumTotalSumOfAllItemsInCart());

	}
}
