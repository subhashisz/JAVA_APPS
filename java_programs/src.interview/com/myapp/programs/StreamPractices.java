package com.myapp.programs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class StreamPractices {

	public static void main(String[] args) {
		String str = "a quick brown fox jumps over aaaa lazy dog";
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

		Long vowelCount = str.chars().filter(c -> vowels.contains((char) c)).count();
		Long consonentCount = str.chars().filter(c -> !vowels.contains((char) c)).filter(n -> (n >= 'a') && (n <= 'z'))
				.count();
		// System.out.println(vowelCount);
		// Pattern.compile(" + ").splitAsStream(str).map(w -> new
		// StringBuilder(w).reverse()).forEach(System.out::print);

		long count = str.chars().filter(ch->"aeiou".contains((char)ch+"")).count(); 
		long numberOfVowels = str.toLowerCase().chars().mapToObj(i -> (char) i)
                .filter(c -> "aeiou".contains(String.valueOf(c)))
                .count(); 
		System.out.println(numberOfVowels);

	}

	public static int countDistinctVowels(String str) {
		str = str.toLowerCase();
		int count = (int) str.chars() // get IntStream of chars
				.mapToObj(c -> (char) c) // cast to char
				.filter(c -> "aeiou".indexOf(c) > -1) // remove all non-vowels
				.distinct() // keep the distinct values
				.count(); // count the values

		return count;
	}


}
