package com.auronpro.model;

public class PayPalPayment implements Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing payment through PayPal");

	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Processing refund through PayPal");
	}

}