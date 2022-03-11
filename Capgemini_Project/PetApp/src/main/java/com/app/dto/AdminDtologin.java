package com.app.dto;

public class AdminDtologin {

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

	public AdminDtologin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public AdminDtologin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "loginDto [userName=" + userName + ", password=" + password + "]";
	}

}
