package com.aurionpro.behavioural.observer.test;

import java.util.Scanner;

import com.aurionpro.behavioural.observer.exception.InsufficantBalance;
import com.aurionpro.behavioural.observer.exception.InvalidAmountException;
import com.aurionpro.behavioural.observer.model.Account;
import com.aurionpro.behavioural.observer.model.EmailNotifier;
import com.aurionpro.behavioural.observer.model.SMSNotifier;
import com.aurionpro.behavioural.observer.model.WaNotifier;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Account number:");
		Integer accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Account name:");
		String name = scanner.nextLine();
		System.out.print("Account balnce:");
		Double balance = scanner.nextDouble();
		
		Account account = new Account(accountNumber, name, balance);
		
		String choice;
		scanner.nextLine();
		System.out.print("Do you want sms notifications? y or n :");
		choice = scanner.nextLine();
		if (choice.equals("y")) 
			account.registerNotifiers(new SMSNotifier());
		
		System.out.print("Do you want emai notifications? y or n :");
		choice = scanner.nextLine();
		if (choice.equals("y")) 
			account.registerNotifiers(new EmailNotifier());
		
		System.out.print("Do you want Whats app notifications? y or n :");
		choice = scanner.nextLine();
		if (choice.equals("y")) 
			account.registerNotifiers(new WaNotifier());
		
		Integer choiceDC =-1;
		while(true) {
			try {
			System.out.println("1)Debit 2)credit 3)exit ");
			choiceDC = scanner.nextInt();
			System.out.print("amount:");
			Double amount = scanner.nextDouble();
			
			if(choiceDC.equals(1)) {
				account.debit(amount);
			}
			if(choiceDC.equals(2)) {
				account.credit(amount);
			}
			if (choiceDC.equals(3)) {
				break;
			}}
			catch (InsufficantBalance e) {
				// TODO: handle exception
				System.err.println(e.toMessage());
			}
			catch (InvalidAmountException e) {
				// TODO: handle exception
				System.err.println(e.toMessage());
			}
		}
		
	}

}
