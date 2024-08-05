package com.techlab.model;

public class Circle extends Shapes {
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void display() {
		System.out.println("Area: "+(3.14*radius*radius));
	}

}
