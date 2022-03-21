package com.myapp.programs;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public Integer[] removeDuplicateInteger(Integer[] arr) {
		return Arrays.stream(arr).distinct().toArray(Integer[]::new);
		// return Arrays.stream(arr).distinct().collect(Collectors.toList()); //return
		// List<Integer>
	}

	public Integer[] removeDuplicateInt(int[] arr) {
		// Converting primitive integer array to an Integer array
		return Arrays.stream(arr).distinct().boxed().toArray(Integer[]::new);

		/*
		 * return Arrays.stream(arr) // IntStream .boxed() // Stream<Integer>
		 * .distinct().collect(Collectors.toList()); //return List<Integer>
		 */
	}

	public int[] removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int[] result = new int[arr.length];
		int temp = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp != arr[i]) {
				result[j] = arr[i];
				temp = result[j];
				j++;
			}
		}
		return Arrays.copyOf(result, j);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 3 };
		for (Integer i : new RemoveDuplicateArray().removeDuplicates(arr)) {
			System.out.println(i);
		}
	}

}
