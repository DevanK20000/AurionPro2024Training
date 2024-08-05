package com.techlab.model;

public class Car extends FourWheeler {
	private int price;

	public Car(String company, int milage,int price) {
		super(company, milage);
		this.price=price;
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [getPrice()=" + getPrice() + ", getMilage()=" + getMilage() + ", getCompany()=" + getCompany()
				+ "]";
	}

}
