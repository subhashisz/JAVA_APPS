package com.myapp.programs;

public class FindThirdHighestArray {

	public static int thirdHighestArray(int[] arr) {
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
		return arr[2];
	}
}
