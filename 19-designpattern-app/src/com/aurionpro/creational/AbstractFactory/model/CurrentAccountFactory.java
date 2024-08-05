package com.aurionpro.creational.AbstractFactory.model;

import java.util.Scanner;

public class CurrentAccountFactory implements IAccountFactory {

	@Override
	public IAccount makeAccount(Scanner scanner, Long accounNumber) {
		// TODO Auto-generated method stub

		scanner.nextLine();
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter balance: ");
		Double balance = scanner.nextDouble();
		System.out.print("Enter over daraft limit: ");
		Double overDraftLimit = scanner.nextDouble();
		return new CurrentAccount(accounNumber, name, balance, overDraftLimit);
	}

}
