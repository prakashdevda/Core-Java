package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue02 {
	public static void main(String[] args) {
		Queue q = new ArrayDeque();
		
		for(char c = 'A'; c <= 'Z'; c++) {
			q.offer(c);
		}
		System.out.println(q);
		System.out.println("peek:" +q.peek());
		System.out.println(q);
		System.out.println("poll:" +q.poll());
		System.out.println(q);
		System.out.println("peek:" +q.peek());
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println(q);
	}

}
