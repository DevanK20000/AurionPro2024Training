package com.techlab.model;

public class Account {
	private int accountId;
	private String name;
	private static int count;
	public Account(int accountId, String name) {
		this.accountId = accountId;
		this.name = name;
	}
	
	public static int accountCount(){
		return count;
	}
	
	{
		count++;
	}
	
}
