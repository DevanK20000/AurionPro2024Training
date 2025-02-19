package com.aurionpro.structural.composit.model;

public abstract class Product implements IBox {
	protected final String title;
	protected final Double price;
	
	public Product(String title, Double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public Double getPrice() {
		return price;
	}

}
