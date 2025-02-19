package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(
				new Account(12, "devan", 700.0),
				new Account(32, "Suresh", 900.1),
				new Account(31, "Mark", 300.12),
				new Account(12, "Jayesh", 500.1),
				new Account(77, "David", 1000.10),
				new Account(45, "morethan6char", 600.0));
		
		//account with max balance
		Optional<Account> maxBalanceAccount = accounts.stream().max((Account account, Account account2) -> account.getBalance().compareTo(account2.getBalance()));
		if(maxBalanceAccount.isPresent())
			System.out.println("Max balance Account\n"+maxBalanceAccount.get());

		//ACCOUNT with min balance
		Optional<Account> minBalanceAccount = accounts.stream().min((Account account, Account account2) -> account.getBalance().compareTo(account2.getBalance()));
		if(maxBalanceAccount.isPresent())
			System.out.println("Min balance Account\n"+minBalanceAccount.get());
		
		//show names greater than six character
		List<Account> sixCharAccount = accounts.stream()
									.filter((Account account)->account.getName().length()>6)
									.collect(Collectors.toList());
		System.out.println("Accounts with more than 6 letters name");
		sixCharAccount.forEach((Account account)->System.out.println(account));
		
		Double totalBalance = accounts.stream()
				.map(account->account.getBalance())
				.reduce(0.0, (account1,account2) -> account1+account2);
		
		System.out.println("Total balance: "+totalBalance);
		
	}

}
