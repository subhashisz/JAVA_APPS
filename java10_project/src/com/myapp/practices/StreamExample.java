package com.myapp.practices;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list1);

		List<Integer> list2 = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list2);

		Stream<Integer> val = Stream.ofNullable(null);
		val.forEach(System.out::println);

		Stream.iterate(1, i -> i <= 10, i -> i * 3).forEach(System.out::println);

	}
}
