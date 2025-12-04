package com.rays.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestantWinner {
	public static void main(String[] args) {
		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Ram", "8822653254"));
		list.add(new Contestant("Syam", "9955612546"));
		list.add(new Contestant("Ajay", "8869532497"));
		list.add(new Contestant("Vijay", "8822653254"));
		list.add(new Contestant("Jay", "9956456345"));
		list.add(new Contestant("Papu", "7785663324"));
		list.add(new Contestant("InvalidNo", "11"));

		System.out.println("---------Get the Phone No-------------");
		list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));

		System.out.println("---------Get the Valid Phone No-------------");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(e -> System.out.println(e));

		System.out.println("--------Remove Duplicate Phone No---------- ");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(e -> System.out.println(e));

		System.out.println("<----Shuffle phone numbers---->");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
