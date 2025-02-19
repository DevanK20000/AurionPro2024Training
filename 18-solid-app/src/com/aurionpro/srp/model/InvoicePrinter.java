package com.aurionpro.srp.model;

public class InvoicePrinter {
	private Invoice invoice;
	private TaxCalculator taxCalculator;
	
	
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}


	public void printInvoice() {
		System.out.println("Id: "+invoice.getId());
		System.out.println("Description: "+invoice.getDescription());
		System.out.println("Amount: "+invoice.getAmount());
		System.out.println("Tax percentage: "+invoice.getTax());
		System.out.println("Total amount: "+(taxCalculator.calculateTax()+invoice.getAmount()));
	}
}
