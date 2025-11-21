package com.rays.collection;


import java.util.ArrayList;
import java.util.List;

public class TestList03 {
	public static void main(String[] args) {
	   List list = new ArrayList();
	
		
		list.add("Ram");
		list.add("Sita");
		list.add('A');
		list.add(25);
		list.add(null);
		list.add("Ram");
		list.add("Prakash Devda");
		list.add("Deepak");
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(2));
		list.set(4, "Rohit");
		System.out.println(list);
		System.out.println(list.indexOf("Rohit"));
		System.out.println(list.lastIndexOf("Prakash Devda"));
		System.out.println(list.subList(0, 5));
	}

}
