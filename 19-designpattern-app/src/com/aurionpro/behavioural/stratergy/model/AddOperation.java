package com.aurionpro.behavioural.stratergy.model;

public class AddOperation implements IOperation {

	@Override
	public void doOperation(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+"+"+b+"="+(a+b));
	}

}
