package com.nt.upi;

import java.util.Random;

public class UPIPaymentOperations {

	
	public String doPayment(String upiId, double amount)
	{
		return amount+"is transferred to"+upiId;
	}
	
	public String addrewars(String txId)
	{
		return txId+"has got"+new Random().nextInt(4000)+"reward points have come";
	}
}

