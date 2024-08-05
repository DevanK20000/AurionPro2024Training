package com.aurionpro.creational.AbstractFactory.model;

import com.aurionpro.creational.AbstractFactory.exceptions.InsufficantBalanceException;
import com.aurionpro.creational.AbstractFactory.exceptions.InvalidAmountException;

public class CurrentAccount implements IAccount {
	private Long accountNumber;
	private String name;
	private Double balance;
	private double OVER_DRAFT_LIMIT;
	private double overDraftLimitAvailableLimit;

	public CurrentAccount(Long accountNumber, String name, Double balance, double oVER_DRAFT_LIMIT) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
		this.overDraftLimitAvailableLimit = oVER_DRAFT_LIMIT;
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

	public double getOVER_DRAFT_LIMIT() {
		return OVER_DRAFT_LIMIT;
	}

	public void setOVER_DRAFT_LIMIT(double oVER_DRAFT_LIMIT) {
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}

	public double getOverDraftLimitAvailableLimit() {
		return overDraftLimitAvailableLimit;
	}

	public void setOverDraftLimitAvailableLimit(double overDraftLimitAvailableLimit) {
		this.overDraftLimitAvailableLimit = overDraftLimitAvailableLimit;
	}

	@Override
	public void debit(Double amount) {
		// TODO Auto-generated method stub
		if (amount <= 0) {
			throw new InvalidAmountException();
		}
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			return;
		}
		if (getBalance() + overDraftLimitAvailableLimit >= amount) {
			overDraftLimitAvailableLimit = getBalance() + overDraftLimitAvailableLimit - amount;
			setBalance(0.0);
			System.out.println("Used Over draft limit\nNew over draft limit available: " + overDraftLimitAvailableLimit
					+ "\nMax over draft limit: " + OVER_DRAFT_LIMIT);
			return;
		}
		throw new InsufficantBalanceException(getBalance(), overDraftLimitAvailableLimit);

	}

	@Override
	public void credit(Double amount) {
		// TODO Auto-generated method stub
		if (overDraftLimitAvailableLimit == OVER_DRAFT_LIMIT) {
			setBalance(getBalance() + amount);
			return;
		}
		if (amount <= OVER_DRAFT_LIMIT) {
			overDraftLimitAvailableLimit += amount;
			System.out.println("Used Over draft credited\nNew over draft limit available: "
					+ overDraftLimitAvailableLimit + "\nMax over draft limit: " + OVER_DRAFT_LIMIT);
			return;
		}
		double limit = overDraftLimitAvailableLimit - amount;
		overDraftLimitAvailableLimit = OVER_DRAFT_LIMIT;
		setBalance(limit);
		System.out.println("Used Over draft credited\nNew over draft limit available: " + overDraftLimitAvailableLimit
				+ "\nMax over draft limit: " + OVER_DRAFT_LIMIT);
	}

}
