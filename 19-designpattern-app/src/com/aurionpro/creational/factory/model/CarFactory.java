package com.aurionpro.creational.factory.model;

public class CarFactory {
	public static ICar makeCar(CarName name) {
		ICar car =null;
		if(name.toString().equals("Maruthi"))
			car = new Maruti();
		
		if(name.toString().equals("Tata"))
			car = new Tata();
		
		if(name.toString().equals("Mahindra"))
			car = new Mahindra();
		return car;
	}

}
