package com.aurionpro.creational.AbstractFactory.model;

public class MahindraFactory implements ICarFactory {

	@Override
	public ICar makeCar() {
		// TODO Auto-generated method stub
		return new Mahindra();
	}

}
