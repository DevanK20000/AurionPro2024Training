package com.techlab.test;

import com.techlab.model.BankTransferPayment;
import com.techlab.model.CreditCardPayment;
import com.techlab.model.PayPalPayment;
import com.techlab.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment creditCardPayment =  new CreditCardPayment();
		creditCardPayment.processPayment();
		creditCardPayment.refund();
		
		Payment payPalPayment = new PayPalPayment();
		payPalPayment.processPayment();
		payPalPayment.refund();
		
		Payment bankTransferPayment  =  new BankTransferPayment();
		bankTransferPayment.processPayment();
		bankTransferPayment.refund();

	}

}
