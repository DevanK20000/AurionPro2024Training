package com.aurionpro.structural.decorator.model;

public class HatDecorator implements IHat {
	IHat hatObj;
	
	public HatDecorator(IHat hatObj) {
		super();
		this.hatObj = hatObj;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.hatObj.getName();
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return this.hatObj.getPrice();
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return this.hatObj.getDiscription();
	}

}
