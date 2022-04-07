package com.myapp.programs;

import java.util.Arrays;

public class MaximumMergeOperationArray {
	public static void main(String[] args) {

		int arr[] = new int[] { 6, 1, 4, 3, 1, 7 };
		System.out.println("Count of minimum operations is " + findMinimumMergeOperationsArray(arr, arr.length));
	}

	public static int findMinimumMergeOperationsArray(int[] arr, int n) {
		int ans = 0;
		for (int i = 0, j = n - 1; i <= j;) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else if (arr[i] > arr[j]) {
				j--;
				arr[j] += arr[j + 1];
				ans++;
			} else {
				i++;
				arr[i] += arr[i - 1];
				ans++;
			}
		}

		return ans;
	}

	public static boolean arrayPalindrome(int[] arr) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[j] = arr[i];
			j++;
		}
		return Arrays.equals(arr, temp);
	}

}
