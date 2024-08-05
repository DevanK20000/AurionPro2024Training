package com.aurionpro.behavioural.stratergy.model;

public class OperationTest {
	public static void main(String[] args) {
		OperationStrategy operationStrategy = new OperationStrategy(new AddOperation());
		operationStrategy.doOperation(5, 10);
		operationStrategy.setOperation(new MultiplicationOperation());
		operationStrategy.doOperation(5, 10);
	}
}
