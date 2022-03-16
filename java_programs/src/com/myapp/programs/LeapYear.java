package com.myapp.programs;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		boolean flag = false;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(2016));
	}

}
