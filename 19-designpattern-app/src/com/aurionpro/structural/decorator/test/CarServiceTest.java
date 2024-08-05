package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspection;
import com.aurionpro.structural.decorator.model.ICarService;
import com.aurionpro.structural.decorator.model.OilChange;
import com.aurionpro.structural.decorator.model.WheelAlignment;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService carService = new CarInspection();
		carService = new OilChange(carService);
		carService = new WheelAlignment(carService);
		System.out.println(carService.getCost());
	}
}
