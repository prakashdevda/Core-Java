package com.rays.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant01Winner {
	public static void main(String[] args) {
		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Rohit", "8845126454"));
		list.add(new Contestant("Deepak", "7563458263"));
		list.add(new Contestant("Sumit", "9645754685"));
		list.add(new Contestant("Ram", "7865325441"));
		list.add(new Contestant("Rakesh", "45623"));
		list.add(new Contestant("Prakash", "4556455"));
		list.add(new Contestant("Rohit", "8845126454"));
		list.add(new Contestant("Sanju", "6325489445"));

		System.out.println("<------------------Get The Phone NO-------------------------->");
		list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));

		System.out.println("<------------------Get The Valid Phone NO-------------------->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(e -> System.out.println(e));

		System.out.println("<------------------Remove Duplicate Phone NO----------------->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(e -> System.out.println(e));

		System.out.println("<------------------Shuffle Phone NO-------------------------->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(2).forEach(e -> System.out.println(e));
	}

}
