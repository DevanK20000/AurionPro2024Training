package com.aurionpro.ocp.test;

import java.util.Scanner;

import com.aurionpro.ocp.model.Diwali;
import com.aurionpro.ocp.model.FixedDeposit;
import com.aurionpro.ocp.model.Holi;
import com.aurionpro.ocp.model.IFestivalType;
import com.aurionpro.ocp.model.NewYear;
import com.aurionpro.ocp.model.Others;
import com.aurionpro.ocp.voilation.model.FestivalType;

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
		FestivalType festivalTypeName= FestivalType.valueOf(scanner.next().toUpperCase());
		IFestivalType festivalType = null;
		switch (festivalTypeName) {
		case DIWALI:
			festivalType = new Diwali();
			break;
		case HOLI:
			festivalType = new Holi();
			break;
		case NEWYEAR:
			festivalType = new NewYear();
			break;
		case OTHERS:
			festivalType = new Others();
			break;
		default:
			break;
		}
		
		
		FixedDeposit fixedDeposit = new FixedDeposit(accountNumber, name, principle, duration, festivalType);
		System.out.println("Simple intreast rate: "+fixedDeposit.calculateSimpleIntreastRate());
		
		FixedDeposit fd1 = new FixedDeposit(123, "devan", 80000.0, 5, new Holi());
		System.out.println("Simple intreast rate: "+fd1.calculateSimpleIntreastRate());
	}
}
