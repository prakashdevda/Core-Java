package com.rays.oop;

public class TestAccount {

	public static void main(String[] args) {

		Account a1 = new Account();

		a1.setNumber("458578585898578");
		a1.setAccountType("saving");
		a1.setBalance(400);

		System.out.println("a1 account no " + a1.getNumber());
		System.out.println("a1 account type " + a1.getAccountType());
		System.out.println("a1 current balance " + a1.getBalance());
		a1.deposit(50);
		a1.withdrawal(300);
		
		System.out.println("--------------");
		
		Account a2 = new Account();

		a2.setNumber("788578585898578");
		a2.setAccountType("current");
		a2.setBalance(20000);

		System.out.println("a2 account no " + a2.getNumber());
		System.out.println("a2 account type " + a2.getAccountType());
		System.out.println("a2 current balance " + a2.getBalance());
		a2.deposit(10000);
		a2.withdrawal(4500);

	}

}
