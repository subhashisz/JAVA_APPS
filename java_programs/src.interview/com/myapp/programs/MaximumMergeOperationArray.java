package com.myapp.programs;

import java.util.Arrays;

/**
 *   Find the minimum number of merge operations to make an array palindrome Given  a list of non-negative integers, find the 
 *   minimum number of merge operations	  to make it a pallindrome. A merge operation can only be performed on two adjacent
 *   elements. The result of a merge operation is that the two adjacent  elements are replaced with their sum. 
     
     For example,
      Input: [6, 1, 3, 7]
	  Output: 1 Explanation: [6, 1, 3, 7] —> Merge 6 and 1 —> [7, 3, 7] 
	 
	  Input: [6, 1, 4, 3, 1, 7] 
	  Output: 2 
	  Explanation: [6, 1, 4, 3, 1, 7] —> Merge  6 and 1 —> [7, 4, 3, 1, 7] —> Merge 3 and 1 —> [7, 4, 4, 7]
	  
	  Input: [1, 3, 3, 1] 
	  Output: 0 Explanation: The list is already a pallindrome
 * @author SUBHASHIS
 *
 */

public class MaximumMergeOperationArray {
	public static void main(String[] args) {

		int arr[] = new int[] { 6, 1, 4, 3, 1, 7 };
		System.out.println("Count of minimum operations is " + findMinimumMergeOperationsArray(arr));
	}

	public static int findMinimumMergeOperationsArray(int[] arr) {
		int ans = 0;
		for (int i = 0, j = arr.length - 1; i <= j;) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} 
			else if (arr[i] > arr[j]) {
				// need to merge from tail.
				j--;
				arr[j] =arr[j]+ arr[j + 1];
				ans++;
			} 
			else {
				i++;
				arr[i] = arr[i]+arr[i - 1];
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
