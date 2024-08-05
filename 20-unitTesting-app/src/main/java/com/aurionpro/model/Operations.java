package com.aurionpro.model;

public class Operations {
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int substraction(int a, int b) {
		return a-b;
	}
	
	public int multiplication(int a,int b) {
		return a*b;
	}
	
	public double division(int a,int b) {
		if(b==0)
			throw new ArithmeticException();
		return (double)a/b;
	}
	
	public boolean isEven(int a) {
		return a%2==0;
	}
}
