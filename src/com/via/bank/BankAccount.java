package com.via.bank;

public class BankAccount {

	// member variable 
	private String owner;
	private int accountID;
	private long balance;
	
	// constructor
	public BankAccount(String owner) {
		this.owner = owner;
		this.balance = 0;
		this.accountID = BankUtil.getNewAccountID();
	}
	
	// methods
	public String getOwner() {
		return this.owner;
	}
	
	public int getAccountID() {
		return this.accountID;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (this.balance < amount)
			return false;
		
		this.balance -= amount;
		return true;
	}
}
