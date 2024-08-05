package com.aurionpro.exceptions;

public class AgeNotValidException extends RuntimeException{
	private int age;
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	public String toMessage() {
		return "Age should be above 18";
	}
}
