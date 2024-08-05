package com.auronpro.model;

public class Triangle implements Shape {
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle: "+(0.5*height*base));
	}

}
