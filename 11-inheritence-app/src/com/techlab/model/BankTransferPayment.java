package com.techlab.model;

public class BankTransferPayment extends Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Processing payment through Bank Transfer");

	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Processing refund through Bank Transfer");
	}

}
