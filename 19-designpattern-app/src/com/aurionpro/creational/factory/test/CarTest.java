package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarName;
import com.aurionpro.creational.factory.model.ICar;

public class CarTest {
	public static void main(String[] args) {
		ICar maruti = CarFactory.makeCar(CarName.Maruthi);
		maruti.start();
		maruti.stop();
		
		ICar tata = CarFactory.makeCar(CarName.Tata);
		tata.start();
		tata.stop();
		
		ICar mahindra = CarFactory.makeCar(CarName.Mahindra);
		mahindra.start();
		mahindra.stop();
	}
}
