package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operations;
	
	@BeforeEach
	void init(){
		operations = new Operations();
	}
	
	@AfterEach
	void status() {
		System.out.println("Task executed");
	}

	@Test
	void testAddition() {
		assertEquals(15, operations.addition(5, 10), "This function must do addition");
	}

	@Test
	void testSubstraction() {
		assertEquals(-5, operations.substraction(5, 10), "This function must do substraction");
	}

	@Test
	void testMultiplication() {
		assertEquals(50, operations.multiplication(5, 10), "This function must do multipliction");
	}

	@Test
	void testDivision() {
		assertEquals(0.5, operations.division(5, 10), "This function must do division");
		assertThrows(ArithmeticException.class, () -> operations.division(10, 0));
	}
	
	@Test
	void testIsEven() {
		assertTrue(operations.isEven(10));
		assertFalse(operations.isEven(3));
	}

}
