package com.rays.streams;

import java.util.ArrayList;
import java.util.List;

public class TestStreams {
	public static void main(String[] args) {
		List <String>list = new ArrayList<String>();
		
		list.add("Uday");
		list.add("Karan");
		list.add("Arjun");
		list.add("Tarun");
		list.add("Tanmay");
		list.add("Beem");
		list.add("Kaliya");
		list.add("Kaliya");
		list.add("Kaliya");
		list.add("Tushar");
		
		list.forEach(System.out::println);
		System.out.println("---------------------------");
		
		list.stream().distinct().forEach(e->System.out.println(e));
		System.out.println("---------------------------");
		
		list.stream().distinct().sorted().forEach(e->System.out.println(e));
		System.out.println("---------------------------");
		
		list.stream().filter(e-> e.startsWith("T")).forEach(e->System.out.println(e));
		System.out.println("---------------------------");
		
		list.stream().distinct().limit(4).forEach(e->System.out.println(e)); 
		System.out.println("---------------------------");
		
		list.stream().distinct().map(e->e.toUpperCase()).forEach(e->System.out.println(e));
		System.out.println("---------------------------");
		
		list.stream().distinct().map(e -> e.toLowerCase()).forEach(e ->System.out.println(e));
		System.out.println("---------------------------");
	}

}
