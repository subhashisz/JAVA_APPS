package com.myapp.programs;

public class ReverseString {
	public static String reverseString(String str) {
		return new StringBuffer(str).reverse().toString();
	}

	public static String reverse(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static int wordCount(String str) {
		return str.isEmpty() ? 0 : str.split("\s").length;
	}

	public static int maxOccuringChar(String str, char ch) {
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				charCount++;
			}
		}
		return charCount;
	}

	public static void main(String[] args) {
		String s = "a quick brown fox jumps over a lazy dog";

		// System.out.println(wordCount(s));

		System.out.println(maxOccuringChar(s, 'a'));
	}

}
