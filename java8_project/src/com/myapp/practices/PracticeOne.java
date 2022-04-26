package com.myapp.practices;

import static com.myapp.dao.DaoUtil.employeeList;
import static com.myapp.dao.DaoUtil.menu;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import com.myapp.models.Dish;
import com.myapp.models.Employee;

public class PracticeOne {
	public static void main(String[] args) {

		// print employee based on department
		Map<Integer, List<Employee>> empByDept = employeeList.stream().collect(groupingBy(Employee::getDeptId));
		
		// way 1 (java 8 Method)
		empByDept.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		
		//On Java 10+:
		/*
		 * for (var entry : map.entrySet()) { System.out.println(entry.getKey() + "/" +
		 * entry.getValue()); }
		 */

		// Get all dish name having calories less then 400
		List<String> lowCalorieDish = menu.stream().filter(d -> d.getCalories() < 400).sorted(comparing(Dish::getCalories)).map(Dish::getName)
				.collect(toList());
		lowCalorieDish.forEach(e->{
			System.out.println(e);
		});
		/*
		 * for(String s:lowCalorieDish) { //System.out.println(s); }
		 */

		// get all vegitarian dish names
		List<String> vegDishNames = menu.stream().filter(d -> d.getType().equals(Dish.Type.VEG) && d.getCalories() < 200).map(d -> d.getName())
				.collect(toList());

		for (String s : vegDishNames) {
			// System.out.println(s);
		}

		List<String> title = Arrays.asList("java8", "python", "scala");
		Stream<String> s = title.stream();
		// s.forEach(System.out::println);
		// s.forEach(System.out::println);

	}

}
