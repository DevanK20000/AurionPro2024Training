package com.aurionpro.structural.decorator.model;

public abstract class CarServiceDecorator implements ICarService {
	ICarService carObj;
	

	public CarServiceDecorator(ICarService carObj) {
		super();
		this.carObj = carObj;
	}


	@Override
	public Double getCost() {
		// TODO Auto-generated method stub
		return this.carObj.getCost();
	}

}
