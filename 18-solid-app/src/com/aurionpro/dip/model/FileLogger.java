package com.aurionpro.dip.model;

public class FileLogger implements ILogger {

	@Override
	public void log(String err) {
		// TODO Auto-generated method stub
		System.err.println("File Logger "+err);
	}

}
