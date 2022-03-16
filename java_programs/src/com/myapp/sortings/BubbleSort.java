package com.myapp.sortings;

public class BubbleSort {

	// Bubble sort is compare and sort algorithm

	public static int[] bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 9, 4, 7, 1, 78, 23 };
		for (int i : bubbleSort(arr)) {
			System.out.println(i);
		}

	}

}
