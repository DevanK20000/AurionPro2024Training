package com.aurionpro.creational.AbstractFactory.model;

public interface IAccount {	
	void debit(Double amount);
	void credit(Double amount);
	Long getAccountNumber();
	String toString();
	
}
