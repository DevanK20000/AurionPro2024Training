package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAccount savings = AccountFactory.accountMaker(AccountType.SAVING,30000);
		savings.credit(10000);
		savings.debit(1000);
		
		IAccount current = AccountFactory.accountMaker(AccountType.CURRENT,20000);
		current.credit(100000);
		current.debit(10000);
	}

}
