package com.aurionpro.structural.facade.test;

import com.aurionpro.structural.fascade.model.HotelResecption;

public class HotelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelResecption hotelResecption = new HotelResecption();
		System.out.println("--------------------------------------------------------");
		hotelResecption.getChineseMenu();
		System.out.println("--------------------------------------------------------");
		hotelResecption.getIndianMenu();
		System.out.println("--------------------------------------------------------");
		hotelResecption.getItialianMenu();
		System.out.println("--------------------------------------------------------");
	}

}
