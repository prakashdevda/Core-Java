package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add('c');
		s.add('b');
		s.add('a');
		s.add('d');
		s.add('a');
		s.add('a');
		s.add(null);
		s.add(null);
		
		System.out.println(s);
    }

}
