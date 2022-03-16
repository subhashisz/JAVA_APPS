package com.myapp.programs;

public class PrimeNumber {

	public static boolean isPrime(int number) {
		int temp = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				temp = temp + 1;
			}
		}
		return temp > 0 ? false : true;
	}

	public static void main(String[] args) {

		System.out.println(isPrime(8));
	}

}
