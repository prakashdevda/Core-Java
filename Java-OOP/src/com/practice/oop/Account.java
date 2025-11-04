package com.practice.oop;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccount(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("New balance after deposit:" + balance);
	}
	public void withdrawal(double amount) {
		balance = balance - amount;
		System.out.println("New balance after withdrawal:" + balance);
	}

}
