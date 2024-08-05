package com.aurionpro.creational.factory.model;

public enum CarName {
	Maruthi, Tata, Mahindra;
	
	public String toString() {
		switch (this) {
		case Maruthi:
			return "Maruthi";
		case Tata:
			return "Tata";
		case Mahindra:
			return "Mahindra";
		default:
			return "Default";
			
		}
	}
}
