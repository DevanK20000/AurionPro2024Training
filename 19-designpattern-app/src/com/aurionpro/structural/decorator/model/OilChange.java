package com.aurionpro.structural.decorator.model;

public class OilChange extends CarServiceDecorator {

	public OilChange(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return this.carObj.getCost()+600;
	}
}
