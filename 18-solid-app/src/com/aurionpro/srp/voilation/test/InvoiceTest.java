package com.aurionpro.srp.voilation.test;

import com.aurionpro.srp.voilation.model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("123", "food", 500.0, 8.0);
		invoice.printInvoice();
 	}

}
