package com.aurionpro.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
	
	public static void main(String[] args) {
		Consumer<Integer> squareConsumer = (Integer number) -> System.out.println("Square of number is: "+number*number);
		squareConsumer.accept(5);
		
		BiConsumer<Integer, Integer> additionConsumer = (number1, number2) -> System.out.println("Addition of numbers is: "+(number1+number2));
	}
}
