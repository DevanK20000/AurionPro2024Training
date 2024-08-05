package com.aurionpro.structural.fascade.model;

public class HotelResecption {
	public void getIndianMenu() {
		IHotel indianHotel = new IndianHotel();
		IMenu menu = indianHotel.getMenu();
		menu.displayMenu();
	}
	public void getChineseMenu() {
		IHotel chineseMenu = new ChineseHotel();
		IMenu menu = chineseMenu.getMenu();
		menu.displayMenu();
	}
	public void getItialianMenu() {
		IHotel itialinMenu = new ItialianHotel();
		IMenu menu = itialinMenu.getMenu();
		menu.displayMenu();
	}
}