package com.myapp.list;

public class BinarySerachTest {

	public static int binarySearch(int[] arr, int item) {
		int index = -1;
		int hi = arr.length;
		int li = 0;
		int mi = (hi + li) / 2;
		while (li < hi) {
			if (item == arr[mi]) {
				index = mi;
				break;
			}
			if (item > arr[mi]) {
				li = mi + 1;
			}
			if (item < arr[mi]) {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}

		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(binarySearch(arr, 6));

	}

}
