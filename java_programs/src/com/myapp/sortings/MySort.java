package com.myapp.sortings;

public class MySort {

	public static int[] sortIt(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 7, 3, 5, 22,23 };
		for (int i : sortIt(arr)) {
			System.out.println(i);
		}
	}

}
