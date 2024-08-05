package com.aurionpro.structural.fascade.model;

public class ItialianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		// TODO Auto-generated method stub
		return new ItialianMenu();
	}

}
