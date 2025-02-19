package com.aurionpro.structural.adapter.test;

import java.util.List;

import com.aurionpro.structural.adapter.model.Buscuit;
import com.aurionpro.structural.adapter.model.Chocolate;
import com.aurionpro.structural.adapter.model.Hat;
import com.aurionpro.structural.adapter.model.HatAdapter;
import com.aurionpro.structural.adapter.model.IItem;
import com.aurionpro.structural.adapter.model.ShoppingCart;

public class ItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart shoppingCart = new ShoppingCart();

		IItem buscuit = new Buscuit("Monaco", 30.0);
		shoppingCart.addItemToCart(buscuit);
		
		IItem chocolate = new Chocolate("Dairy Milk", 100.0);
		shoppingCart.addItemToCart(chocolate);
		
		Hat hat = new Hat("topi", "Hat", 1000.0, 18.0);
		IItem hatAdapter = new HatAdapter(hat);
		shoppingCart.addItemToCart(hatAdapter);
		
		shoppingCart.displayShopingCart();
	}

}
