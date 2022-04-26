package com.myapp.practices;

import static com.myapp.dao.DaoUtil.employeeList;
import static com.myapp.dao.DaoUtil.menu;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

import com.myapp.models.Dish;;

public class PracticeTwo {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2 };

		// menu.stream().map(d -> d.getType()).distinct().forEach(System.out::println);
		String s = menu.stream().map(Dish::getName).collect(joining());
		
		// Fibonacci series
		 Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(t -> t[0]).forEach(System.out::println);
		
		 //Stream.iterate(0, n -> n + 2 ).limit(10).forEach(System.out::println);
		 
		List<int[]> aList= Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1]})
		                         .limit(10)
		                         .collect(toList());
		
		int [][]arr1=new int[5][5];
		
	}
}
