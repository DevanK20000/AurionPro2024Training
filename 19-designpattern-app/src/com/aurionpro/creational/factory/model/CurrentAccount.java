package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount {
	private Integer balance=0;
	
	
	public CurrentAccount(Integer balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void credit(Integer amount) {
		// TODO Auto-generated method stub
		this.balance += amount;
		System.out.println(amount +" credited new Balance: "+balance);
	}

	@Override
	public void debit(Integer amount) {
		// TODO Auto-generated method stub
		this.balance-= amount;
		System.out.println(amount +" debited new Balance: "+balance);
	}

}
