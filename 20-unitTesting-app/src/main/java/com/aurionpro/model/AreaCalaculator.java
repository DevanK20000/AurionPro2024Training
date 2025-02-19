package com.aurionpro.model;

public class AreaCalaculator {
	
	double calculateAreaOfCircle(double radius) {
		return 3.14*radius*radius;
	}
	
	double calculateAreaOfRectangle(double height,double width) {
		return height*width;
	}
	
	double calculateAreaOfTriangle(double base, double height) {
		return 0.5*base*height;
	}
}
