package com.myapp.programs;

public class FindNthHighestArray {
	// 0 1 2 3
	public static int[] sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static int getSecondLargest(int[] arr, int index) {
		int temp = 0;
		if (index > arr.length) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[index - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 5 };
		System.out.println(getSecondLargest(arr, 2));
	}

}
