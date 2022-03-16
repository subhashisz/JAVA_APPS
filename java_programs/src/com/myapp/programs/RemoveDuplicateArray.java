package com.myapp.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArray {

	public Integer[] removeDuplicateInteger(Integer[] arr) {
		return Arrays.stream(arr).distinct().toArray(Integer[]::new);
		// return Arrays.stream(arr).distinct().collect(Collectors.toList()); //return List<Integer>
	}

	public Integer[] removeDuplicateInt(int[] arr) {
		// Converting primitive integer array to an Integer array
		return Arrays.stream(arr).distinct().boxed().toArray(Integer[]::new);

		/*
		 * return Arrays.stream(arr) // IntStream .boxed() // Stream<Integer>
		 * .distinct().collect(Collectors.toList()); //return List<Integer>
		 */
	}

}
