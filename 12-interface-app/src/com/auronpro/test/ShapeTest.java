package com.auronpro.test;

import com.auronpro.model.Circle;
import com.auronpro.model.Rectangle;
import com.auronpro.model.Shape;
import com.auronpro.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape;
		shape = new Circle(10);
		shape.area();
		
		shape = new Rectangle(10, 15);
		shape.area();

		shape = new Triangle(2, 5);
		shape.area();
	}

}
