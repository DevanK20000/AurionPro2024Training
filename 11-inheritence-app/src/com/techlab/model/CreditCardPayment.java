package com.techlab.model;

public class CreditCardPayment extends Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method 
		System.out.println("Processing payment through credit card");

	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Processing refund through credit card");

	}

}
