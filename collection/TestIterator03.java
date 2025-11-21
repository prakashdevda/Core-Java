package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Sumit Yadav");
		list.add(23);
		list.add("Ram");
		list.add("Sita");
		list.add(45);
		list.add(12.4);
		list.add("Rohit");
		list.add(null);
		list.add("Kiran");
		
		System.out.println(list);
		
		System.out.println("------------Start Iterator------------");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o +",");
		}
		
		System.out.println("------------Start For Each Loop--------");
		for(Object o : list) {
			System.out.println(o +",");
		}
		
		System.out.println("------------Start For Each Method-------");
		list.forEach(e ->System.out.println(e +","));
	}

}
