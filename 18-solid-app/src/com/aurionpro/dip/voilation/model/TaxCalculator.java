package com.aurionpro.dip.voilation.model;

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
			new DBLogger().Log("Divided by zero");
		}
		return tax;
	}
}
