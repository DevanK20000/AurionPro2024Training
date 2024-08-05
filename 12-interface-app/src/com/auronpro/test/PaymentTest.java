package com.auronpro.test;

import com.auronpro.model.BankTransferPayment;

import com.auronpro.model.CreditCardPayment;
import com.auronpro.model.PayPalPayment;
import com.auronpro.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment payment;
		payment =  new CreditCardPayment();
		payment.processPayment();
		payment.refund();
		
		payment = new PayPalPayment();
		payment.processPayment();
		payment.refund();
		
		payment  =  new BankTransferPayment();
		payment.processPayment();
		payment.refund();

	}

}
