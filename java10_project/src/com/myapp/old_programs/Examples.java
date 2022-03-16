package com.myapp.old_programs;

public class Examples {

	public static int reverseNumber(int number) {
		int rev = 0;

		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		return rev;
	}

	public static boolean isArmstrong(int number) {
		int t1 = number, t2 = number, length = 0, arm = 0, mul, rem;
		boolean flag = false;
		while (t1 != 0) {
			length = length + 1;
			t1 = t1 / 10;
		}
		while (t2 != 0) {
			rem = t2 % 10;// 12
			mul = 1;
			for (int i = 0; i < length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == number) {
			flag = true;
		}
		return flag;
	}

	public static int[] sort(int[] arr) {
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

	public static int getKthHighest(int[] arr, int index) {
		if (index > arr.length) {
			throw new UnsupportedOperationException();
		}
		return sort(arr)[index - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 6, 2, 5, 7, 0 };
		for (int i : sort(arr)) {
			System.out.println(i);
		}
	}

}
