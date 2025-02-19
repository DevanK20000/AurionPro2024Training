package com.aurionpro.prototype.test;

import com.aurionpro.prototype.model.Car;
import com.aurionpro.prototype.model.CarPrototype;

public class CarTest {

	public static void main(String[] args) {
		Car hondaPrototype = new Car("Honda", "Civic", 2022);
        System.out.println(hondaPrototype);
        System.out.println(hondaPrototype.hashCode());
		

        // Clone and display cars
        Car clonedHonda = (Car) hondaPrototype.clone();
        System.out.println(clonedHonda);
        System.out.println(clonedHonda.hashCode());
        clonedHonda.setYear(2024);
        System.out.println(clonedHonda);
        System.out.println(hondaPrototype);
    }
}