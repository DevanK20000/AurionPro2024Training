package com.aurionpro.builder.test;

import com.aurionpro.builder.model.User;

public class userTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User.UserBuider().setEmail("devan@adas.com").build();
		System.out.println(user);
	}

}