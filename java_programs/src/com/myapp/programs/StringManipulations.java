package com.myapp.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author SUBHASHIS
 */

public class StringManipulations {

	// 1) How to find the maximum occurring character in a given String?

	public int charecterOccurrence(String input, char ch) {
		int charCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				charCount++;
			}
		}
		return charCount;
	}

	// 3) Reverse String
	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return new StringBuffer(str).reverse().toString();
		// return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

	// 4) Find all permutations of a given String using recursion
	public String permutation(String word) {
		String result = null;
		if (word.isEmpty()) {
			return word;
		} else {
			for (int i = 0; i < word.length(); i++) {
				result = permutation(word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
		return result;
	}

	/*
	 * Another way to check if two Strings are anagram or not in Java This method
	 * assumes that both word and anagram are not null and lowercase
	 * 
	 * @return true, if both Strings are anagram.
	 */
	public boolean iAnagram(String word1, String word2) {
		if (word1.isEmpty() || word2.isEmpty() || word1.length() != word2.length()) {
			return false;
		}
		char[] charFromWord = word1.toCharArray();
		char[] charFromAnagram = word2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);

		return Arrays.equals(charFromWord, charFromAnagram);
	}

	// Java Program to count number of words in String

	public int countWord(String word) {
		return word.trim().isEmpty() ? 0 : word.split("\\s+").length;
	}

	// 2) Reverse words of String java 8
	public static String reverseWordsInString(String str) {
		return String.join(" ", Pattern.compile(" +").splitAsStream(str).collect(LinkedList::new, LinkedList::addFirst,
				(a, b) -> a.addAll(0, b)));
	}

	public static String reverseWordCharacters(String str) {
		return Pattern.compile(" +").splitAsStream(str).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
	}

	/* * Method to reverse words in String in Java */
	public String reverseWords(String str) {
		List<String> words = Arrays.asList(str.split("\\s"));
		Collections.reverse(words);
		StringBuffer sb = new StringBuffer(str.length());
		for (int i = words.size() - 1; i >= 0; i--) {
			sb.append(words.get(i));
			sb.append(' ');
		}
		return sb.toString().trim();
	}

	// Find longest sub-string in a given string
	public String longestSubString(String str) {
		if (str.isEmpty()) {
			return null;
		}
		String result = "";
		String tempStr = "";
		for (int i = 0; i < str.length(); i++) {
			// 1. if tempStr contains new character, then change tempStr
			if (tempStr.contains("" + str.charAt(i))) {
				tempStr = tempStr.substring(tempStr.lastIndexOf(str.charAt(i)) + 1);
			}
			// 2. add new character
			tempStr = tempStr + str.charAt(i);
			// 3. replace result with tempStr if tempStr is longer
			if (result.length() < tempStr.length()) {
				result = tempStr;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// System.out.println(new
		// StringManipulations().longestSubString("stackoverflow"));
		System.out.println(reverseWordsInString("Hello how are you"));

	}

}
