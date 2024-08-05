package com.techlab.model;

public class Rectangle extends Shapes {
	private int length;
	private int breath;
	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area: "+(length*breath));
	}

}
