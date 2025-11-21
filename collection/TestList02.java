package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList02 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Ram");
		list.add('A');
		list.add("Ram");
		list.add("Sita");
		list.add("Deepak");
		list.add("Ram");
		list.add(null);
		list.add(null);
		list.add("karan");
		
		System.out.println(list);
		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list);
		list.set(3, "Radha");
		System.out.println(list);
		System.out.println(list.indexOf("Radha"));
		System.out.println(list.lastIndexOf("Ram"));
		System.out.println(list.subList(1, 5));
		
		
		
	}

}
