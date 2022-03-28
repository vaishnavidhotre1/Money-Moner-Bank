package com.cap.account;

import com.cap.application.MMBankFactory;
import com.cap.application.MMCurrentAcc;
import com.cap.application.MMSavingAcc;
import com.cap.framework.BankFactory;
import com.cap.framework.CurrentAcc;
import com.cap.framework.SavingAcc;

public class account {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(12345678,"vaishu",2000,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca = new MMCurrentAcc(987654321,"Vrushali",2000,1000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}
	
}
