package com.aurionpro.creational.singleton.model;

public class Login {
	private static Login login;

	private Login() {
		super();
	}
	
	public static Login getLogin() {
		if(login==null) {
			login = new Login();
		}
		return login;
	}
	
	public void getStatus(){
		System.out.println("Login successfull");
		
	}
	
	

}
