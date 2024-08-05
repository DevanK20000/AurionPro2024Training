package com.techlab.model;

public class Triangle extends Shapes {
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area: "+(height*base*0.5));
	}

}
