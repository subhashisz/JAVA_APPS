package com.myapp.programs;

/**
 * 
 * @author SUBHASHIS
 * 
 *         We basically ignore half of the elements just after one comparison.
 * 
 *         1=> Compare x with the middle element. 2=> If x matches with the
 *         middle element, we return the mid index. 3=> Else If x is greater
 *         than the mid element, then x can only lie in the right half subarray
 *         after the mid element. So we recur for the right half. 4=> Else (x is
 *         smaller) recur for the left half.
 *
 */
public class BinarySearch {

	public static int binarySearch(int[] arr, int item) {
		int index = -1;
		int li = 0;
		int hi = arr.length;
		int mi = (li + hi) / 2;

		while (li < hi) {
			if (arr[mi] == item) {
				index = mi;
				break;
			} else if (item > arr[mi]) {
				li = mi + 1;
			} else { // item < arr[mi]
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(binarySearch(arr, 62));
	}

}
