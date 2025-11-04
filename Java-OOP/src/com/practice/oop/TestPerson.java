package com.practice.oop;

public class TestPerson {
	public static void main(String[] args) {
		Person n1 = new Person();
		
		n1.setName("Prakash Devda");
		n1.setAddress("Double Chouki Dist:-Dewas 455001 (M.P.)");
		n1.setAge(30);

		
		System.out.println("n1 Person Name:" + " = " + n1.getName());
		System.out.println("n1 Person Address:" + " = " + n1.getAddress());
		System.out.println("n1 Person Age:" + " = " + n1.getAge() + " year ");
	}

}
