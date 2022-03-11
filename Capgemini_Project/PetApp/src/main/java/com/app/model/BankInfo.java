package com.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Bank_Info")
public class BankInfo {
	@Id
	private long account_Number;
	private String bank_Name;
	private long ifsc;
	private String user_Name;
	private double mob;

	public long getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(long account_Number) {
		this.account_Number = account_Number;
	}

	public String getBank_Name() {
		return bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}

	public long getIfsc() {
		return ifsc;
	}

	public void setIfsc(long ifsc) {
		this.ifsc = ifsc;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public double getMob() {
		return mob;
	}

	public void setMob(double mob) {
		this.mob = mob;
	}

	public BankInfo(long account_Number, String bank_Name, long ifsc, String user_Name, double mob) {
		super();
		this.account_Number = account_Number;
		this.bank_Name = bank_Name;
		this.ifsc = ifsc;
		this.user_Name = user_Name;
		this.mob = mob;
	}

	public BankInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "BankInfo [account_Number=" + account_Number + ", bank_Name=" + bank_Name + ", ifsc=" + ifsc
//				+ ", user_Name=" + user_Name + ", mob=" + mob + "]";
//	}

}
