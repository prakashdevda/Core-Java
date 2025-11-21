package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(69);
		c.add(88);
		c.add(75);
		c.add(66);
		c.add(45.5);
		c.add("Prakash devda");
		c.add(25);
		c.add(true);

		System.out.println("c:" + c);
		System.out.println("--------------");

		for (Object O : c) {
			System.out.println(O);

		}

		Collection c1 = new ArrayList();

		c1.add(56);
		c1.add(58);
		c1.add(36);
		c1.add("Sumit Yadav");
		c1.add(6.4);
		c1.add(34);
		c1.add(true);

		System.out.println("c1:" + c1);
		System.out.println("-----------------");

		for (Object O1 : c1) {
			System.out.println(O1);

		}

	}

}
