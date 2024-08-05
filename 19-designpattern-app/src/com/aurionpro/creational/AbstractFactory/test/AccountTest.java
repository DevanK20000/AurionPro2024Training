package com.aurionpro.creational.AbstractFactory.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.creational.AbstractFactory.exceptions.AccountNotFoundException;
import com.aurionpro.creational.AbstractFactory.exceptions.InsufficantBalanceException;
import com.aurionpro.creational.AbstractFactory.exceptions.InvalidAmountException;
import com.aurionpro.creational.AbstractFactory.model.CurrentAccount;
import com.aurionpro.creational.AbstractFactory.model.CurrentAccountFactory;
import com.aurionpro.creational.AbstractFactory.model.IAccount;
import com.aurionpro.creational.AbstractFactory.model.SavingAccount;
import com.aurionpro.creational.AbstractFactory.model.SavingAccountFactory;


public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<IAccount> accounts = new ArrayList<IAccount>();
		int choice = -1;
			while(choice!=5) {
				System.out.println("\nWelcome to Banking");
			    System.out.println("1 -> Create New Bank Account ");
			    System.out.println("2 -> Deposit Money");
			    System.out.println("3 -> Withdraw Money");
			    System.out.println("4 -> Account details");
			    System.out.println("5 -> Exit");
			    System.out.print("Select : ");
				choice = scanner.nextInt();
				
				if(choice==1) {
					IAccount account = createBankAccount(scanner,accounts);
					accounts.add(account);
				}
				else if(choice==2) {
					System.out.println("============Credit Menu============");
					try {
						IAccount account = getAccountByNumber(scanner, accounts);
						creditMenu(account,scanner);
					} catch (AccountNotFoundException e) {
						// TODO Auto-generated catch block
						System.err.println(e.toMessage());
					}
				}
				else if(choice==3) {
					try {
					System.out.println("=============Debit Menu============");
					IAccount account = getAccountByNumber(scanner, accounts);
					debitMenu(account,scanner);
					} catch (AccountNotFoundException e) {
						System.err.println(e.toMessage());
					}
				}
				else if(choice==4) {
					try {
						IAccount account = getAccountByNumber(scanner, accounts);
						System.out.println(account);
					} catch (AccountNotFoundException e) {
						System.err.println(e.toMessage());
					}
				}
				}
			}

	private static IAccount getAccountByNumber(Scanner scanner, ArrayList<IAccount> accounts) {
			System.out.print("Enter Account number: ");
			Long accountNumber = scanner.nextLong();
			for(IAccount account:accounts) {
				if(account.getAccountNumber().equals(accountNumber)) {
					return account;
				}
			}
			throw new AccountNotFoundException();
			
	}

	private static void debitMenu(IAccount account,Scanner scanner) {
		try {
			if(account!=null) {
				System.out.print("Enter the amount: ");
				Double amount=scanner.nextDouble();
				account.debit(amount);
				System.out.println(account);
				return;
			}
			System.err.println("Account number does not exists");
		}
		catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.err.println(e.toMessage());
		}
		catch(InsufficantBalanceException e) {
			System.err.println(e.toMessage());
		}
	}
	
	private static void creditMenu(IAccount account,Scanner scanner) {
		try {
		if(account!=null) {
			System.out.print("Enter the amount: ");
			Double amount=scanner.nextDouble();
			account.credit(amount);
			System.out.println(account);
			return;
		}
		System.err.println("Account number does not exists");
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.err.println(e.toMessage());
		}
		catch(InsufficantBalanceException e) {
			System.err.println(e.toMessage());
		}
	}

	private static IAccount createBankAccount(Scanner scanner,ArrayList<IAccount> accounts) {
        long accountNumber = generateUniqueAccountNumber(accounts);
        System.out.println("\n======================================");
        System.out.println("Your account number is "+accountNumber);
        while(true) {
        	System.out.print("\nEnter Account Type\nEnter '1' for current and '2' for saving:");
        	int accountType = scanner.nextInt();
        	switch (accountType) {
			case 1:
				System.out.println("Creating current account...");
				IAccount currentAccount = new CurrentAccountFactory().makeAccount(scanner, accountNumber);
				return currentAccount;
			case 2:
				System.out.println("Creating savings account...");
				IAccount savingAccount = new SavingAccountFactory().makeAccount(scanner, accountNumber);
				return savingAccount;
			default:
				System.err.println("Enter a valid option");
				break;
			}
        	
        }

	}
	
	private static Long generateUniqueAccountNumber(ArrayList<IAccount> accounts) {
		long accountNumber;
		ArrayList<Long> accountNumbers = new ArrayList<Long>();
		for(IAccount account:accounts) {
			accountNumbers.add(account.getAccountNumber());
		}
		while(true) {
	          accountNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
	          if(accountNumbers == null || !accountNumbers.contains(accountNumber)) {
	            break;
	            }
		}
		return accountNumber;
	}

}