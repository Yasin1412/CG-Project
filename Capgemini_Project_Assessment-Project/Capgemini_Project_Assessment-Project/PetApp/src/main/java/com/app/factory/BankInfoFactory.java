package com.app.factory;

import com.app.dao.BankInfoDao;
import com.app.daoimpl.BankInfoImple;


public class BankInfoFactory {
	public static BankInfoDao getBankInfoDao()
	{
		return new BankInfoImple();
	}

}

