package com.aurionpro.ocp.voilation.test;

import java.util.Scanner;

import com.aurionpro.ocp.voilation.model.FestivalType;
import com.aurionpro.ocp.voilation.model.FixedDeposit;

public class FDTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account number: ");
		Integer accountNumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter principle ammount: ");
		Double principle =  scanner.nextDouble();
		
		System.out.print("Enter duration: ");
		Integer duration = scanner.nextInt();
		
		System.out.print("Enter festival type: ");
		FestivalType festivalType = FestivalType.valueOf(scanner.next().toUpperCase());
		
		FixedDeposit fixedDeposit = new FixedDeposit(accountNumber, name, principle, duration, festivalType);
		System.out.println("Simple intreast rate: "+fixedDeposit.calculateSimpleIntreastRate());
	}
}
