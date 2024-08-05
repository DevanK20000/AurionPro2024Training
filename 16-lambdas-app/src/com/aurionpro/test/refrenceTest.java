package com.aurionpro.test;

import com.aurionpro.model.Itest;
import com.aurionpro.model.Refrence;

public class refrenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Itest test = Refrence::new;
		method(test);
		
		Itest test2 = Refrence::staticPrint;
		method(test2);
		
		Refrence refrence = new Refrence();
		
		Itest test3 = refrence::print;
		method(test3); 
		
	}
	public static void method(Itest test) {
		test.display();
	}

}
