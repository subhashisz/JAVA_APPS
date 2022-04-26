package com.myapp.programs;

public class Practice {

	public static int findMissingNumbers(int[] nums) {
		int sum = ((nums.length + 1) * (nums.length + 2)) / 2; //15
		for (int i = 0; i < nums.length; i++) {
			sum = sum - nums[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6 };
		System.out.println(findMissingNumbers(a));
	}

}
