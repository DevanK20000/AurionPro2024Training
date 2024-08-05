package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class FactorialTest {

	static IFactorial factorial =null; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial=(number) -> number==0?1:number*factorial.factorial(number-1);
		System.out.println(factorial.factorial(5));
	}

}
