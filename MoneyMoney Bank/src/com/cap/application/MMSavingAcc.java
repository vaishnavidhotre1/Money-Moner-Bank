package com.cap.application;

import com.cap.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float accBla = 3000;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float accBal) {
		System.out.println("Dear User, your account blance are:"+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}



}
