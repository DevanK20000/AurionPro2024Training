package com.aurionpro.creational.factory.model;

public class AccountFactory {
	public static IAccount accountMaker(AccountType accountType, Integer balance) {
		IAccount account = null;
		if (accountType == AccountType.SAVING) {
			account = new SavingsAccount(balance);
		}
		if (accountType == AccountType.CURRENT) {
			account = new CurrentAccount(balance);		
		}
		return account;
		
	}

}
