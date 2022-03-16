package com.myapp.programs;

public class FindElementOnceOccuredInArray {
	//find the element once occurred in an array of integer
	public static int findElement(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
		System.out.println(findElement(arr));
	}

}
