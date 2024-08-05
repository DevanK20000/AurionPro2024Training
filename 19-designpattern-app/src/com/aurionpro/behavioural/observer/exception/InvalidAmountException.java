package com.aurionpro.behavioural.observer.exception;

public class InvalidAmountException extends RuntimeException {
	public String toMessage() {
		return "Amount should be more than 0";
	}
}
