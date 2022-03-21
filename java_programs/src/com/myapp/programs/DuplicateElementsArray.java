package com.myapp.programs;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsArray {

	public static List<Integer> findDuplicateArray(int[] arr) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					result.add(arr[i]);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 55 };
		for (Integer i : findDuplicateArray(arr)) {
			System.out.println(i);
		}
	}

}
