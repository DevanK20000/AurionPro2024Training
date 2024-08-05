package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hatObj) {
		super(hatObj);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Golden "+this.hatObj.getName();
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return this.hatObj.getPrice()+400;
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return this.hatObj.getDiscription()+" ,Golden Hat";
	}
	
}
