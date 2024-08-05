package com.aurionpro.srp.model;

public class TaxCalculator {

	private Invoice invoice;
	
	public TaxCalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	
	public Double calculateTax() {
		return invoice.getAmount()*invoice.getTax() /100;
	}
}