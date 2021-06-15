package com.via.bank;

public class BankUtil {
	private static int lastAccountID = 1000;
	
	public static int getNewAccountID() {
		lastAccountID++;
		return lastAccountID;
	}
}
