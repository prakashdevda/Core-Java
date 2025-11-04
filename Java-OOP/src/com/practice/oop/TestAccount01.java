package com.practice.oop;

public class TestAccount01 {
	public static void main(String[] args) {
		Account a1 = new Account();
		
		a1.setNumber("15226630001515");
		a1.setAccount("Seving");
		a1.setBalance(20500);
		System.out.println("a1 Account No"+ "="+ a1.getNumber());
		System.out.println("a1 Account Type"+ "="+ a1.getAccountType());
		System.out.println("a1 Account Balance"+ "=" + a1.getBalance());
	}

}
