package com.myapp.programs;

public class BinarySearchRecurrsiveApproach {

	public static int binarySearchRecursive(int[] array, int start, int end, int search) {
		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}
		if (search < array[middle]) {
			return binarySearchRecursive(array, start, middle - 1, search);
		}
		if (search > array[middle]) {
			return binarySearchRecursive(array, middle + 1, end, search);
		}
		if (search == array[middle]) {
			return array[middle];
		}
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearchRecurrsiveApproach ob = new BinarySearchRecurrsiveApproach();
		int arr[] = { 2, 3, 4, 10, 40 };
		int arrLength = arr.length;
		int search = 10;
		int start = 0;
		int result = ob.binarySearchRecursive(arr, start, arrLength - 1, search);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
