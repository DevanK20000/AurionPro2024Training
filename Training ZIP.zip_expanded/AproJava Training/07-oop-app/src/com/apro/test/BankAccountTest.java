package com.apro.test;

import java.util.HashMap;
import java.util.Scanner;

import com.apro.model.BankAccount;

//3. create a class BankAccount(accountNumber, name, balance). Create getter and setters. Also add credit(amount) and debit(amount) methods    with all possible scenarios and proper error messages. Create a test class.
//Accept values from user.
public class BankAccountTest {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,BankAccount> hm = new HashMap<>();
		int choice =-1;
		while(choice != 4) {
			choice();
			choice=scanner.nextInt();
			if(choice ==1) {
				System.out.println("Enter Account Number");
				int accountNumber = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Account Name");
				String name = scanner.nextLine();
				
				System.out.println("Enter Account Balance");
				int balance = scanner.nextInt();
				scanner.nextLine();
				BankAccount account = new BankAccount(accountNumber, name, balance);
				hm.put(accountNumber,account);
			}
			else if(choice ==2) {
				System.out.println("Enter Account Number");
				int accountNumber = scanner.nextInt();
				BankAccount ac = hm.getOrDefault(accountNumber,new BankAccount());
				if(ac.getAccountNumber()==0) {
					System.out.println("Invalid Account Number");
					continue;
				}
				System.out.println("Enter credit amount : ");
				int amount = scanner.nextInt();
				int balance = ac.creditAmount(amount, ac);
				if(balance ==-1) {
					System.out.println("Avaialable balance is : "+ac.getBalance());
				}
				else {
					System.out.println("Credited successfully");
					System.out.println("Avaialable balance is : "+ac.getBalance());
				}
				
			}
			else if(choice ==3) {
				System.out.println("Enter Account Number");
				int accountNumber = scanner.nextInt();
				BankAccount ac = hm.getOrDefault(accountNumber, new BankAccount());
				if(ac.getAccountNumber()==0) {
					System.out.println("Invalid Account Number");
					continue;
				}
				System.out.println("Enter debit amount : ");
				int amount = scanner.nextInt();
				int balance = ac.debit(amount, ac);
				if(balance ==-1) {
					System.out.println("Avaialable balance is : "+ac.getBalance());
				}
				else {
					System.out.println("Debited successfully");
					System.out.println("Avaialable balance is : "+ac.getBalance());
				}
			}
			System.out.println("--------------------------------------");
		}
		
	}
	 
	public static void choice() {
		System.out.println("Select from the following choices : ");
		System.out.println("1 -> Create New Bank Account ");
		System.out.println("2 -> Deposit Money");
		System.out.println("3 -> Withdraw Money");
		System.out.println("4 -> Exit");
	}
}
