package com.rays.collection;


import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(8);
		c.add(8.5);
		c.add("PRAKASH DEVDA");
		c.add(56);
		c.add(63);
		c.add(true);
		System.out.println("c:"+ c);
		System.out.println("--------");
		
		for(Object o : c) {
			System.out.println(o);
		}
	}
	}


