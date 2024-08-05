package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(123,"devan");
		System.out.println(Account.accountCount());
		
		Account account2 = new Account(234,"devan2");
		System.out.println(Account.accountCount());
		
	}

}
