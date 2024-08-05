package com.aurionpro.structural.adapter.model;

public class Buscuit implements IItem {
	private String name;
	private Double price;

	public Buscuit(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Double getItemPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
