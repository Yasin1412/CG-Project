package com.app.dto;

import java.util.Scanner;

import com.app.model.User;

public class UserRequestDto {

	Scanner sn = new Scanner(System.in);

	public User userregisteRequest() {
		System.out.println("enter your userName:");
		String uname = sn.next();
		System.out.println("enter your email:");
		String email = sn.next();
		System.out.println("enter your password:");
		String password = sn.next();
		System.out.println("enter your mobile:");
		long mobile = sn.nextLong();
		System.out.println("enter your address:");
		String address = sn.next();
		System.out.println("enter your Gender:");
		String gender = sn.next();
		return new User(uname, email, password, address, mobile, gender);

	}

	public UserDtologin loginRequest() {
		System.out.println("enter your userName:");
		String uname = sn.next();
		System.out.println("enter your password:");
		String password = sn.next();
		return new UserDtologin(uname, password);
	}

}
