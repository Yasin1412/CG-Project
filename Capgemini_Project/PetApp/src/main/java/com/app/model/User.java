package com.app.model;
import jakarta.persistence.*;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String email;
	private String password;
	private String address;
	private long mobile;
	private String Gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "User2 [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", mobile=" + mobile + ", Gender=" + Gender + "]";
	}

	public User( String userName, String email, String password, String address, long mobile, String gender) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.mobile = mobile;
		Gender = gender;
	}

	protected User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
