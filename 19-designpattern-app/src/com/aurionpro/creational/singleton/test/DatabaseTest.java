package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.Database;

public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database database1 = Database.getDatabase();
		database1.getStatus();
		System.out.println(database1.hashCode());
		
		Database database2 = Database.getDatabase();
		database2.getStatus();
		System.out.println(database2.hashCode());
	}

}
