package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet02 {
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add('d');
		s.add('b');
		s.add('a');
		s.add('c');
		s.add('a');
		s.add('a');
		s.add('b');
		s.add('c');
		s.add(null);
		s.add(null);
		s.add('d');
		s.add('e');
		System.out.println(s);
	}

}
