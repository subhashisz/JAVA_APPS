package com.myapp.programs;

public class EvaluateCharectersString {

	public static void main(String[] args) {
		String str = "aa";
		System.out.println(repeatCount(str));
		str.chars().filter(c -> "aeiou".contains((char) c + "")).count();
	}

	public static int vowelCount(String str) {
		int vCount = 0;
		int cCount = 0;
		int rCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount = vCount + 5;
			} else {
				cCount = cCount + 1;
			}
			// rCount = repeatCount(str);

		}
		return vCount + rCount + cCount;
	}

	public static int repeatCount(String str) {
		int result = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				result = result + 5;
			}
		}
		return result;
	}

}
