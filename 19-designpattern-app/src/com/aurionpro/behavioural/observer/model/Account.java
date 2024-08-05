package com.aurionpro.behavioural.observer.model;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.behavioural.observer.exception.InsufficantBalance;
import com.aurionpro.behavioural.observer.exception.InvalidAmountException;

public class Account {
	private Integer accountNumber;
	private String name;
	private Double balance;
	private List<INotifier> notifiers = new ArrayList<INotifier>();
	public Account(Integer accountNumber, String name, Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
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
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	public void debit(Double amount) {
		if(amount<=0) {
			sendNotifications("Failed Transaction performed");
			throw new InvalidAmountException();
	}
		if(balance<amount) {
			sendNotifications("Failed Transaction performed");
			throw new InsufficantBalance();
		}
		balance -= amount;
		sendNotifications("Debited amount "+amount+", New balance "+balance);
		
	}
	
	public void credit(Double amount) {
		if(amount<=0) {
			sendNotifications("Failed Transaction performed");
			throw new InvalidAmountException();
		}
		balance += amount;
		sendNotifications("Credited amount "+amount+", New balance "+balance);
	}
	
	private void sendNotifications(String message) {
		notifiers.stream().forEach(noitfiers->noitfiers.giveNotification(this, message));
	}
	
	public void registerNotifiers(INotifier notifier) {
		notifiers.add(notifier);
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", notifiers="
				+ notifiers + "]";
	}
	
	
}