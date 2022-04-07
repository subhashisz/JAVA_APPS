package com.myapp.practices;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PracticeThree {

	public static int[] removeDuplicateArray(int[] arr) {
		Arrays.sort(arr);
		int[] result = new int[arr.length];
		int temp = 0;
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (temp != arr[i]) {
				result[j] = arr[i];
				temp = result[j];
				j++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] test = new int[][] { { 1, 1, 2, 2, 3, 4, 5 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 1, 1, 1, 1, 1 } };
		for (int[] i : test) {
			// Arrays.stream(i).distinct().forEach(System.out::print);
			for (int j : removeDuplicateArray(i)) {
				System.out.print( j+",");
				
			}
			System.out.println();

		}
		
		//Arrays.stream(test).flatMap(a->Arrays.stream(a).distinct().forEach(new::int))).
		
		int a[]= {2,3,2,1,1,1};
		for(int i:removeDuplicateArray(a)) {
			//System.out.print( i+",");
		}
	}

}
