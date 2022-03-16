package com.myapp.programs;

public class ArmstrongNumber {

	public static boolean isArmstrong(int number) {
		boolean flag = Boolean.FALSE;
		int t1 = number, t2 = number, length = 0, rem, mul, arm = 0;
		// get the length of the number
		while (t1 != 0) {
			length = length + 1;
			t1 = t1 / 10;
		}
		// take one number from the given number
		while (t2 != 0) {
			mul = 1;
			rem = t2 % 10;
			// multiply according to the finding length and generate a new number
			for (int i = 0; i < length; i++) {
				mul = mul * rem;
			}
			// create a new number
			arm = arm + mul;
			t2 = t2 / 10;
		}
		// compare the resulting number is equal to the given number
		if (arm == number) {
			flag = Boolean.TRUE;
		}

		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
