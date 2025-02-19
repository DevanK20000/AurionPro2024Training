package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.GoldenHat;
import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.RibbionHat;
import com.aurionpro.structural.decorator.model.StandardHat;

public class HatDecoratorTest {
	public static void main(String[] args) {
		IHat hat = new StandardHat();
		hat = new RibbionHat(hat);
		System.out.println("Name: "+hat.getName());
		System.out.println("Price: "+hat.getPrice());
		System.out.println("Discription: "+hat.getDiscription());
		
		System.out.println("\n------------------------------------------------------\n");
		
		IHat hat2 = new PremiumHat();
		hat2 = new GoldenHat(hat2);
		hat2 = new RibbionHat(hat2);
		System.out.println("Name: "+hat2.getName());
		System.out.println("Price: "+hat2.getPrice());
		System.out.println("Discription: "+hat2.getDiscription());
	}

}
