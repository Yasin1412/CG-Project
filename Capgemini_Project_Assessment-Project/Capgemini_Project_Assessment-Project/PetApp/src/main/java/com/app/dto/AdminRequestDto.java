package com.app.dto;
import java.util.Scanner;

import com.app.model.Admin;


public class AdminRequestDto {
	Scanner sn = new Scanner(System.in);

	public Admin adminregisteRequest() {
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
		return new Admin(uname, email, password, address, mobile);

	}

	public AdminDtologin loginRequest() {
		System.out.println("enter your userName:");
		String uname = sn.next();
		System.out.println("enter your password:");
		String password = sn.next();
		return new AdminDtologin(uname, password);
	}

}
