package com.auronpro.model;

public class Rectangle implements Shape {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle: "+(length*width));
	}

}
