package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Ram");
		list.add('a');
		list.add(65);
		list.add("Ram");
		list.add("Ram");
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		
		System.out.println("----------Iterator start---------------");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o +", ");
		}
		System.out.println("----------Iterator finish---------------");
		
		
		System.out.println("----------for Each Loop start-----------");
		for(Object o : list) {
			System.out.println(o + ",");
		}
		
		System.out.println("---------for Each Loop finish------------");
		
		
		System.out.println("---------for Each Method start----------");
		list.forEach(e -> System.out.println(e + " ,"));
		System.out.println("---------for Each Method finish----------");
		
	}

}
