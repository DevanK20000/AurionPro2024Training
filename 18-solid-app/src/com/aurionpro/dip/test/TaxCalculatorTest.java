package com.aurionpro.dip.test;

import com.aurionpro.dip.model.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator();
		t1.calculateTax(100, 10);
		
		TaxCalculator t2 = new TaxCalculator();
		t2.calculateTax(200, 0);
	}
}
