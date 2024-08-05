package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 3, 27, 218, 328, 35);

//		Stream<Integer> numbersStream = numbers.stream();
//		numbersStream.forEach((number)->System.out.println(number));

		System.out.println("All numbres");
		numbers.stream().forEach((number) -> System.out.println(number));

		System.out.println("All odd numbers greater than 25");
		List<Integer> fillteredNumbrs = numbers.stream()
												.filter((number) -> (number % 2) != 0)
												.filter(number -> number > 25)
												.collect(Collectors.toList());
		
		fillteredNumbrs.forEach(number -> System.out.println(number));
		
		
		System.out.println("Square of numbers");
		List<Integer> squareNumber = numbers.stream()
											.map(number -> number*number)
											.collect(Collectors.toList());
		
		squareNumber.forEach(number -> System.out.print(number+" "));
		
		int sum = numbers.stream().reduce(0, (number1,number2)->number1+number2);
		System.out.println("\nSum of all number is: "+sum);
		
				
		List<Integer> sortedNumber = numbers.stream()
											.sorted()
											.collect(Collectors.toList());
		System.out.println("Sorted Number: "+sortedNumber);
		
		
		List<Integer> reverseSortedNumber = numbers.stream()
												   .sorted(Comparator.reverseOrder())
												   .collect(Collectors.toList());
		
		System.out.println("Reverse sorted number: "+reverseSortedNumber);
		
		List<Integer> reverseSortedNumber2 = numbers.stream()
													.sorted(Collections.reverseOrder())
													.collect(Collectors.toList());
		
		System.out.println("Reverse sorted number2: "+reverseSortedNumber2);
		
		List<Integer> limitSortedNumber = numbers.stream()
													.sorted()
													.limit(3)
													.collect(Collectors.toList());
		System.out.println("Sorted Number limited to 3: "+limitSortedNumber);
		
		Optional<Integer> maxNumber = numbers.stream()
											 .max((number1, number2) -> number1.compareTo(number2));
		
		if(maxNumber.isPresent())
			System.out.println("Max is: "+maxNumber.get());
		
		Optional<Integer> minNumber = numbers.stream()
				 .min((number1, number2) -> number1.compareTo(number2));

		if(minNumber.isPresent())
			System.out.println("Mix is: "+minNumber.get());
		
		
		
		
	}
}
