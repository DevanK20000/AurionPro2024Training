package com.aurionpro.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction = number -> number*number;
		System.out.println(squareFunction.apply(9));
		
		BiFunction<Integer, Integer, Integer> productBiFunction = (number1, number2) -> number1*number2;
		System.out.println(productBiFunction.apply(5, 5));
	}
}
