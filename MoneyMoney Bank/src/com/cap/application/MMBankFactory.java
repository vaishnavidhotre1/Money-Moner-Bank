package com.cap.application;

import com.cap.framework.BankFactory;
import com.cap.framework.CurrentAcc;
import com.cap.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
