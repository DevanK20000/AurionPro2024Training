package com.auronpro.model;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle: "+(3.14*radius*radius));
	}

}
