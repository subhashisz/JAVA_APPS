package com.myapp.programs;


/**
 *    Evaluate each character to output a total score:	  
	  Vowels are worth 5 points. All other characters are worth of 1 point. Any immediately repeated character is worth its 
	  current value plus the value of the previous character. Any words with more than 5 characters get 5 bonus points added.
	  be sure to write unit test that proves the program is correct.
	  
	  "Test" = 1+5+1+1=8 "Balloon"=1+5+1+(1+1)+5+(5+5)+1+5 bonus=30
	  
 * @author SUBHASHIS
 *
 */
public class EvaluateCharectersString {

	public static void main(String[] args) {
		String str = "lloo";
		System.out.println(repeatCount(str));
		str.chars().filter(c -> "aeiou".contains((char) c + "")).count();
	}

	/**
	 * Evaluate each character to output a total score:	  
	  Vowels are worth 5 points. All other characters are worth of 1 point. Any immediately repeated character
	  is worth its current value plus the value of the previous character. Any words with more than 5 characters 
	  get 5 bonus points added. be sure to write unit test that proves the program is correct.
	  
	  "Test" = 1+5+1+1=8 "Balloon"=1+5+1+(1+1)+5+(5+5)+1+5 bonus=30
	 */
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
			 rCount = repeatCount(str);

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
