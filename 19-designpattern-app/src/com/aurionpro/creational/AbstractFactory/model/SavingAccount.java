package com.aurionpro.creational.AbstractFactory.model;

import com.aurionpro.creational.AbstractFactory.exceptions.InvalidAmountException;
import com.aurionpro.creational.AbstractFactory.exceptions.InsufficantBalanceException;

public class SavingAccount implements IAccount{
	private Long accountNumber;
	private String name;
	private Double balance;
	private Double minBalance;
	public SavingAccount(Long accountNumber, String name, Double balance, Double minBalance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minBalance = minBalance;
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(Double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public void debit(Double amount) {
		// TODO Auto-generated method stub
		if(amount<=0) {
			throw new InvalidAmountException();
		}
		Double balance = getBalance();
		if (balance>=amount && balance-amount>=minBalance) {
			setBalance(balance-amount);
			return;
		}
		throw new InsufficantBalanceException(balance,minBalance,true);
		
	}
	@Override
	public void credit(Double amount) {
		// TODO Auto-generated method stub
		if(amount<=0)
			throw new InvalidAmountException();
		balance = balance +amount;
	}
	
	
}
