package com.aurionpro.structural.decorator.model;

public class StandardHat implements IHat {
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hat";
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 200.0;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return "Standard Hat";
	}

}
