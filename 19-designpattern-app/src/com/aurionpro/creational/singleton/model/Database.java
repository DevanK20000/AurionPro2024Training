package com.aurionpro.creational.singleton.model;

public class Database {
	private static Database database;

	private Database() {
		super();
		System.out.println("Database created");
	}
	
	public void getStatus() {
		System.out.println("Database Connected");
	}
	
	public static Database getDatabase() {
		if(database==null)
			database = new Database();
		return database;
	}
	
}
