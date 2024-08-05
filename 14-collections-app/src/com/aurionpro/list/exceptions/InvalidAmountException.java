package com.aurionpro.list.exceptions;

public class InvalidAmountException extends RuntimeException {
	public String toMessage() {
		return "Enter a valid Amount";
	}
}
