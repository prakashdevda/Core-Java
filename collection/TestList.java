package com.rays.collection;


import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Ram");
		list.add('a');
		list.add("Ram");
		list.add("Ram");
		list.add(null);
		list.add(null);
		 
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list);
		list.set(0, "Sits");
		System.out.println(list);
		System.out.println(list.indexOf("Ram"));
		System.out.println(list.lastIndexOf("Ram"));
		System.out.println(list.subList(0, 4));
	}

}
