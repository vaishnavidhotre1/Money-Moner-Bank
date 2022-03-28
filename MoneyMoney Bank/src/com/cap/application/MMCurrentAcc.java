package com.cap.application;

import com.cap.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(final float creditLimit) {
 	System.out.println("Dear User, your account blance are:"+accBal+" after withdraw are:"+creditLimit);

	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

}
