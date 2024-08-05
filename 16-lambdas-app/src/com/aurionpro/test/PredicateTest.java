package com.aurionpro.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> evenPredicate = number -> number%2==0;
		System.out.println(evenPredicate.test(5));
		
		BiPredicate<Integer, Integer> greaterBiPredicate = (number1, number2) -> number1>number2;
		System.out.println(greaterBiPredicate.test(10, 5));
	}
}
