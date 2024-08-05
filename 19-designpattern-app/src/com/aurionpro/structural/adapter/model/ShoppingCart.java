package com.aurionpro.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<IItem> cartItem = new ArrayList<IItem>();

//	public ShoppingCart(List<IItem> cartItem) {
//		super();
//		this.cartItem = cartItem;
//	}
	
	public void addItemToCart(IItem item) {
		this.cartItem.add(item);
	}

	public List<IItem> getCartItem() {
		return cartItem;
	}
	
	public Double getCartPrice() {
		return this.cartItem.stream()
							.mapToDouble(item -> item.getItemPrice())
							.reduce(0, (item1,item2)-> item1+item2);
	}
	
	public void displayShopingCart() {
		System.out.printf("%-15s %-15s\n","Item Name","Price");
		System.out.println("------------------------");
		this.cartItem.forEach(items->System.out.printf("%-15s %-15s\n",items.getItemName(),items.getItemPrice()));
		System.out.println("------------------------");
		System.out.printf("%-15s %-15s","Total",getCartPrice());
	}
	
}
