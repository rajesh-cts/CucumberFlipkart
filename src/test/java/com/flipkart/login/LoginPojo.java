package com.flipkart.login;

public class LoginPojo {	
	
	public LoginPojo(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginPojo [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
