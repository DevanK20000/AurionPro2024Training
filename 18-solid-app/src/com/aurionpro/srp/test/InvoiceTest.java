package com.aurionpro.srp.test;

import com.aurionpro.srp.model.Invoice;
import com.aurionpro.srp.model.InvoicePrinter;
import com.aurionpro.srp.model.TaxCalculator;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("123", "food", 500.0, 8.0);
		TaxCalculator taxCalculator = new TaxCalculator(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
		invoicePrinter.printInvoice();
 	}

}
