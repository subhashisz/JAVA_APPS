package com.myapp.programs;

public class ReverseNumber {
	public static int reverseInt(int number) {
		int temp = number, rem, rev = 0;

		// flag marks if x is negative
		boolean flag = false;
		if (number < 0) {
			number = 0 - number;
			flag = true;
		}

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		return rev;
	}

	public static int reverse(int x) {
		int res = 0, mod;
		// flag marks if x is negative
		boolean flag = false;
		if (x < 0) {
			x = 0 - x;
			flag = true;
		}

		int p = x;
		while (p > 0) {
			mod = p % 10;
			res = res * 10 + mod;
			p = p / 10;
		}
		if (flag) {
			res = 0 - res;
		}
		return res;
	}

	public static int reverseNumber(int number) {
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10; //12
			number = number / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(123));

	}

}
