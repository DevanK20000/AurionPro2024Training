package com.aurionpro.builder.model;

public class User {
	private String userId;
	private String username;
	private String email;
	private String password;
	private User(UserBuider builder) {
		super();
		this.userId = builder.userId;
		this.username = builder.username;
		this.email = builder.email;
		this.password = builder.password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static class UserBuider {
		private String userId;
		private String username;
		private String email;
		private String password;
		
		public static UserBuider UserBuider() {
			return new UserBuider();
		}
		
		public UserBuider setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		public UserBuider setUsername(String username) {
			this.username = username;
			return this;
		}
		public UserBuider setEmail(String email) {
			this.email = email;
			return this;
		}
		public UserBuider setPassword(String password) {
			this.password = password;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
			
		}
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
}
