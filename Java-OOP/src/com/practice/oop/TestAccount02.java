package com.practice.oop;

public class TestAccount02 {
	public static void main(String[] args) {
		Account n1 = new Account();
		
		n1.setNumber("256341005502");
		n1.setAccount("Seving");
		n1.setBalance(4500);
		
		System.out.println("AccountNo:" + n1.getNumber());
		System.out.println("AccountType:" + n1.getAccountType());
		System.out.println("Current Balance:" + n1.getBalance());
		
	}

}
