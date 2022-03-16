package com.myapp.programs;

public class MergeTwoArray {

	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			result[arr1.length + i] = arr2[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };

		for (int i : mergeTwoArray(arr1, arr2)) {
			System.out.println(i);
		}

	}
}
