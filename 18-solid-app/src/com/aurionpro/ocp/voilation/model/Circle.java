package com.aurionpro.ocp.voilation.model;

public class Circle implements Shape {
	private int radius;
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return (Math.PI*(Math.pow(radius,2)));
	}

}
