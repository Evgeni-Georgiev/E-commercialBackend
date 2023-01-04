package org.ecommerce;

public class Application {
	public static void main(String[] args) {

		Product iPhone = new Product("iPhone", 1300.00);
		Product Mac = new Product("Mac", 2300.00);
		Product iPad = new Product("iPad", 300.00);
		Product iPod = new Product("iPod", 700.00);

		CartItem iphoneItem = new CartItem(iPhone, 5);
		CartItem macItem = new CartItem(Mac, 15);
		CartItem padItem = new CartItem(iPad, 25);
		CartItem podItem = new CartItem(iPod, 45);


		Cart itemsInCart = new Cart();
		itemsInCart.addAllCartItems(iphoneItem);
		itemsInCart.addAllCartItems(macItem);
		itemsInCart.addAllCartItems(padItem);
		itemsInCart.addAllCartItems(podItem);

		itemsInCart.runCartOutput();
		System.out.println(itemsInCart.runSumTotalSumOfAllItemsInCart());
		System.out.println("DDS: " + itemsInCart.calculateDDS());

	}
}
