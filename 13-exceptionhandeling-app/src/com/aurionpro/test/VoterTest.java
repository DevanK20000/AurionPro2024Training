package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		Voter voter = null;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter votter id: ");
			int voterId= scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter first name: ");
			String firstName = scanner.nextLine();
			System.out.println("Enter last name: ");
			String lastName = scanner.nextLine();
			System.out.println("Enter age: ");
			int age = scanner.nextInt();
			
			voter = new Voter(voterId, firstName, lastName, age);
		} catch (AgeNotValidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toMessage());
		}
		finally {
			System.out.println(voter);
		}
		
	}

}
