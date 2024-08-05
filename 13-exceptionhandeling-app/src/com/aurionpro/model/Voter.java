package com.aurionpro.model;

import com.aurionpro.exceptions.AgeNotValidException;

public class Voter {
	private int voiterId;
	private String firstName;
	private String lastName;
	private int age;
	public Voter(int voiterId, String firstName, String lastName, int age){
		super();
		this.voiterId = voiterId;
		this.firstName = firstName;
		this.lastName = lastName;
			if (age<18) {
				throw new AgeNotValidException(age);
			}
			this.age = age;
		
	}
	public int getVoiterId() {
		return voiterId;
	}
	public void setVoiterId(int voiterId) {
		this.voiterId = voiterId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
		if (age<18) {
			throw new AgeNotValidException(age);
		}
		this.age = age;}
		catch (AgeNotValidException e) {
			System.out.println(e.toMessage());
		}
	}
	@Override
	public String toString() {
		return "Voter [voiterId=" + voiterId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	
	
	
	
	
}
