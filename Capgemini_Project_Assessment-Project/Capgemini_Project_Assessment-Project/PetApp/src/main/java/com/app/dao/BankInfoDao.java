package com.app.dao;

import java.util.List;

import com.app.model.BankInfo;
import com.app.model.Pets;


public interface BankInfoDao {
	int insertBankData(BankInfo b);
	List<BankInfo> listBankInfo();
	
	
}
