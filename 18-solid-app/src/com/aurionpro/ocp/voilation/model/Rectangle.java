package com.aurionpro.ocp.voilation.model;

public class Rectangle implements Shape{
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return (double) (width*height);
	}
	
	
}
