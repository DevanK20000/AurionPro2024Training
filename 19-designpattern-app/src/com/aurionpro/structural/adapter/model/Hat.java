package com.aurionpro.structural.adapter.model;

public class Hat {
	private String shortName;
	private String longName;
	private Double basicPrice;
	private Double tax;
	public Hat(String shortName, String longName, Double basicPrice, Double tax) {
		super();
		this.shortName = shortName;
		this.longName = longName;
		this.basicPrice = basicPrice;
		this.tax = tax;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public Double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(Double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}

}
