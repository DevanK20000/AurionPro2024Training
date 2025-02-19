package com.aurionpro.creational.singleton.test;

import com.aurionpro.creational.singleton.model.Login;

public class LoginTest {
	public static void main(String[] args) {
		Login login = Login.getLogin();
		login.getStatus();
		System.out.println(login.hashCode());
		
		Login login2 = Login.getLogin();
		login2.getStatus();
		System.out.println(login2.hashCode());
	}
}
