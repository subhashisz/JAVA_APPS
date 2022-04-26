package com.myapp.programs;

public class MinimumSumSubArray {
	
	 // FIND MAXIMUM SUM SUB-ARRAY
		// O(n)
		public static int minSubArraySum(int[] arr) {
			int minSum = 0;
			int curSum = 0;
			for (int num : arr) {
				curSum = curSum + num;
				minSum = Math.min(minSum, curSum);
				curSum = Math.min(curSum, 0);
			}
			return minSum;
		}
		
		public static void main(String[] args) {

			int arr[] = { 3, -4, 2, -3, -1, 7, -9 };

			int n = arr.length;
			// subArraySumMin(arr);
			System.out.println(minSubArraySum(arr));

		}

}
