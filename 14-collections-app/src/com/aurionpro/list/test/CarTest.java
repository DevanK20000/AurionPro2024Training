package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import com.aurionpro.list.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of cars:");
		int noOfCars= scanner.nextInt();
		
		List<Car> cars = createCarList(scanner, noOfCars);	
		
		System.out.println("Printing Cars");
		readCars(cars);
		
		System.out.println("Car with highest milage");
		maximumMilage(cars);
	}
	
	private static void maximumMilage(List<Car> cars) {
		double highestMilage = 0;
		Car highestMilageCar = null;
		for(Car car:cars) {
			if (car.getMilage()>= highestMilage){
				highestMilage = car.getMilage();
				highestMilageCar = car;
			}
		}
		System.out.println(highestMilageCar);
	}

	private static void readCars(List<Car> cars) {
		for(Car car:cars) {
			System.out.println(car);
		}
	}

	private static List<Car> createCarList(Scanner scanner, int noOfCars) {
		List<Car> cars = new ArrayList<Car>();
		for(int i=0; i<noOfCars;i++){
			System.out.print("Enter car ID: ");
		    int id = scanner.nextInt();
		    System.out.print("Enter company name: ");
		    scanner.nextLine();
		    String name = scanner.nextLine();
		    System.out.print("Enter price: ");
		    double price = scanner.nextDouble();
		    System.out.println("Enter milage: ");
		    double milage = scanner.nextDouble();
		    cars.add(new Car(id, name, price, milage));
		}
		return cars;
	}

}
