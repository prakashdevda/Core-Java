package com.rays.streams;

import java.util.ArrayList;
import java.util.List;

public class TestStreams01 {
	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		
		list.add("Rahul");
		list.add("Sumit");
		list.add("Suraj");
		list.add("Kanha");
		list.add("Kanha");
		list.add("Deepak");
		list.add("Anand");
		list.add("Dinesh");
		list.add("Suresh");
		list.add("Bhopal");
		
		list.forEach(System.out::println);
		System.out.println("-----------");
		
		list.stream().distinct().forEach(e ->System.out.println(e));
		System.out.println("-----------");
		
		list.stream().distinct().sorted().forEach(e ->System.out.println(e));
		System.out.println("-----------");
		
		list.stream().filter(e ->e.startsWith("S")).forEach(e ->System.out.println(e));
		System.out.println("-----------");
		
		list.stream().distinct().limit(4).forEach(e -> System.out.println(e));
		System.out.println("-----------");
		
		list.stream().distinct().map(e -> e.toUpperCase()).forEach(e->System.out.println(e));
		System.out.println("-----------");
		
		list.stream().distinct().map(e -> e.toLowerCase()).forEach(e->System.out.println(e));
		System.out.println("-----------");
	}

}
