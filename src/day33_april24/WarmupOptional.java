package day33_april24;

import java.util.Arrays;

public class WarmupOptional {

	public static void main(String[] args) {

		/*
		 * Optional : create a method that take one String parameter as sentence return
		 * first character for first word and all characters of last word except first
		 * char example : Love Java --> Lava
		 * 
		 */

		String sentence = "I love java";// "java";//"Hold the Door";//"Love java";

		System.out.println(getMyString(sentence));

	}

	public static String getMyString(String sentence) {
		String firstChar = sentence.substring(0, 1);
		String[] allWords = sentence.split(" ");
		// System.out.println(Arrays.deepToString(allWords));
		String lastWord = allWords[allWords.length - 1];

		String targetWord = firstChar + lastWord.substring(1);
		return targetWord;

	}
}
