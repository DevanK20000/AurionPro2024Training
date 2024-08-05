package com.aurionpro.dip.model;

public class DBLogger implements ILogger{
	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.err.println("Logged database "+err);
		
	}

}
