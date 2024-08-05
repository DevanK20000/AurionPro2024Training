package com.aurionpro.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		double result = number1/number2;
		System.out.println("Division is:"+ result);
		}
		catch (ArithmeticException exception) {
			// TODO: handle exception
			System.out.println("Cannot divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Division requires two arguments. Please enter two values.");
		}
		catch (NumberFormatException exception) {
			System.out.println("Please eneter number values.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error occured");
		}
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("Exiting...");

	}

}
