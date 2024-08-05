package com.aurionpro.creational.AbstractFactory.test;

import com.aurionpro.creational.AbstractFactory.model.ICar;
import com.aurionpro.creational.AbstractFactory.model.MahindraFactory;
import com.aurionpro.creational.AbstractFactory.model.MarutiFactory;
import com.aurionpro.creational.AbstractFactory.model.TataFactory;

public class CarTest {
	public static void main(String[] args) {
		ICar maruti = new MarutiFactory().makeCar();
		maruti.start();
		maruti.stop();
		
		ICar tata = new TataFactory().makeCar();
		tata.start();
		tata.stop();
		
		ICar mahindra = new MahindraFactory().makeCar();
		mahindra.start();
		mahindra.stop();
	}
}
