package com.aurionpro.creational.AbstractFactory.model;

import java.util.Scanner;

public class SavingAccountFactory implements IAccountFactory{

	@Override
	public IAccount makeAccount(Scanner scanner, Long accountNumber) {
		// TODO Auto-generated method stub
		scanner.nextLine();
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter balance: ");
		Double balance = scanner.nextDouble();
		System.out.print("Enter minimum balance: ");
		Double minBalance = scanner.nextDouble();
		return new SavingAccount(accountNumber, name, balance, minBalance);
		
	}

}
