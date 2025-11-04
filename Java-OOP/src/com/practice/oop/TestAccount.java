package com.practice.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account a2 = new Account();

		a2.setNumber("450005623000012");
		a2.setAccount("seving");
		a2.setBalance(2000);

		System.out.println("a2 Account No" + " = " + a2.getNumber());
		System.out.println("a2 Account Type" + " = " + a2.getAccountType());
		System.out.println("a2 Total Balance" + " = " + a2.getBalance());
		a2.deposit(500);
		a2.withdrawal(1000);

		System.out.println("--------------------------------------------");

		Account a3 = new Account();

		a3.setNumber("450005623000012");
		a3.setAccount("seving");
		a3.setBalance(2000);

		System.out.println("a3 Account No" + " = " + a3.getNumber());
		System.out.println("a3 Account Type" + " = " + a3.getAccountType());
		System.out.println("a3 Total Balance" + " = " + a3.getBalance());
		a3.deposit(500);
		a3.withdrawal(1000);
	}

}
