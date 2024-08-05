package com.aurionpro.structural.decorator.model;

public class WheelAlignment extends CarServiceDecorator {

	public WheelAlignment(ICarService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return this.carObj.getCost()+500;
	}
}
