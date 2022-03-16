package com.myapp.programs;

public class LinearSearch {

	public static String linearSearch(int[] arr, int element) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				result = "Element present at index " + i;
				break;
			} else {
				result = "Element not present";
			}
		}

		return result;
	}
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(linearSearch(arr1, 32));
	}
}
