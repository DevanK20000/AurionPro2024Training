package com.aurionpro.structural.decorator.model;

public class PremiumHat implements IHat {
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Premium Hat";
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 500.0;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return "Premium Hat";
	}

}