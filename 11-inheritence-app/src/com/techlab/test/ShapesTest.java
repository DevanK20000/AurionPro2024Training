package com.techlab.test;

import com.techlab.model.Circle;
import com.techlab.model.Rectangle;
import com.techlab.model.Shapes;
import com.techlab.model.Triangle;

public class ShapesTest {

	public static void main(String[] args) {
		
		Shapes shape;
		
		shape = new Circle(10);
		shape.display();
		
		shape = new Rectangle(10,20);
		shape.display();
		
		shape = new Triangle(20,10);
		shape.display();

	}

}
