package com.techlab.model;

public class FourWheeler extends Vehicle {
	private int milage;

	public FourWheeler(String company,int milage) {
		super(company);
		this.milage = milage;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

}
