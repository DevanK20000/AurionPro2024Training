package com.aurionpro.dip.model;

public class TaxCalculator {
	public Integer calculateTax(Integer amount,Integer rate) {
		int tax=0;
		try {
			tax = amount/rate;
			System.out.println(tax);
			return tax;
		}
		catch (Exception e) {
			// TODO: handle exception
			new DBLogger().log("Divided by zero");
			new FileLogger().log("Divide by zero");
			}
		return tax;
	}
}
