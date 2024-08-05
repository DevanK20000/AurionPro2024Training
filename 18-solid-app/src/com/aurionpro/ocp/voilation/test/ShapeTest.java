package com.aurionpro.ocp.voilation.test;

import com.aurionpro.ocp.voilation.model.Circle;
import com.aurionpro.ocp.voilation.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(10, 15);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(12);
		System.out.println(circle.getArea());

	}

}
