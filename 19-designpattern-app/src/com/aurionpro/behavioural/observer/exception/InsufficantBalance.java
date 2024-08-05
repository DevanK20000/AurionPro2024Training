package com.aurionpro.behavioural.observer.exception;

public class InsufficantBalance extends RuntimeException {
	public String toMessage() {
		return "Insufficant Balance";
	}
}
