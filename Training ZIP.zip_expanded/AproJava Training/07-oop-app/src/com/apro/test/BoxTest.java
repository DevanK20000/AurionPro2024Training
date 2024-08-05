package com.apro.test;

import java.util.Scanner;

import com.apro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details of box1 - ");
		System.out.println("Enter height : ");
		int h =sc.nextInt();
		box1.setHeight(h);
		System.out.println("Enter width : ");
		int w =sc.nextInt();
		box1.setWidth(w);
		System.out.println("Enter depth : ");
		int d =sc.nextInt();
		box1.setDepth(d);
		System.out.println("Details of box 1 are as follows : ");
		System.out.println("Height : "+box1.getHeight());
		System.out.println("Width  : "+box1.getWidth());
		System.out.println("Depth : "+box1.getDepth());
		System.out.println();
		// BOX 2
		
		Box box2 = new Box();
		System.out.println("Enter Details of box2 - ");
		System.out.println("Enter height : ");
		h =sc.nextInt();
		box2.setHeight(h);
		System.out.println("Enter width : ");
		w =sc.nextInt();
		box2.setWidth(w);
		System.out.println("Enter depth : ");
		d =sc.nextInt();
		box2.setDepth(d);
		// display
		
		System.out.println("Details of box 2 are as follows : ");
		System.out.println("Height : "+box2.getHeight());
		System.out.println("Width  : "+box2.getWidth());
		System.out.println("Depth : "+box2.getDepth());
		
		
	}

}
