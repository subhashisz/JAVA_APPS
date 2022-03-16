package com.myapp.dao;

import java.util.Arrays;
import java.util.List;

import com.myapp.models.Dish;
import com.myapp.models.Employee;

public class DaoUtil {

	public static List<Employee> employeeList = Arrays.asList(
			new Employee(101, "ram", 101, "active", 2000),
			new Employee(102, "shyam", 102, "active", 3000),
			new Employee(103, "raghu", 103, "inactive", 2000),
			new Employee(104, "arnab", 102, "active", 5000),
			new Employee(105, "litu", 104, "active", 5000),
			new Employee(106, "ashok", 106, "inactive", 5000),
			new Employee(106, "john", 101, "active", 2500),
			new Employee(107, "smith", 108, "inactive", 8000));

	public static List<Dish> menu=Arrays.asList(
			new Dish("chicken", false, 800, Dish.Type.MEAT),
			new Dish("Egg", false, 500, Dish.Type.OTHER),
			new Dish("paneer", true, 300, Dish.Type.VEG),
			new Dish("beans", true, 100, Dish.Type.VEG),
			new Dish("mutton", false, 1000, Dish.Type.MEAT),
			new Dish("prawn", false, 600, Dish.Type.FISH),
			new Dish("salmon", false, 700, Dish.Type.FISH),
			new Dish("pizza", true, 300, Dish.Type.OTHER),
			new Dish("rice", true, 300, Dish.Type.VEG),
			new Dish("fruit salad", true, 100, Dish.Type.VEG),
			new Dish("french fries", true, 100, Dish.Type.VEG),
			new Dish("mushroom", false, 800, Dish.Type.OTHER));

}
