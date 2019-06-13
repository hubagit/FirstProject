package day28_april14;

import java.util.Arrays;

public class Warmup {

	public static void main(String[] args) {

		String str = "Sunday Perfect Day to start coding";

		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println("===========1===============");
		String reversedWord = "";
		for (int i = 0; i < words.length; i++) {

			String eachWord = words[i];
			char[] myChars = eachWord.toCharArray();
			for (int j = 0; j < myChars.length / 2; j++) {

				char temp = myChars[j];
				myChars[j] = myChars[myChars.length - 1 - j];
				myChars[myChars.length - 1 - j] = temp;

			}

			String reversed = new String(myChars);
			reversedWord += reversed + " ";

		}
		System.out.println(reversedWord);

		System.out.println("===========2===============");
		for (int i = words.length - 1; i >= 0; i--) {

			if (i == 0) {
				System.out.print(words[i]);
			} else
				System.out.print(words[i] + "-");

		}
		System.out.println();
		// Optional : reverse word + reverse each char of the words
		String strRev = "";
		for (int i = 0; i < words.length / 2; i++) {
			String temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;

			String eachWord = words[i];
			char[] wordChars = eachWord.toCharArray();
			
			for (int j = 0; j < wordChars.length/2; j++) {
				char temp2 = wordChars[j];
				wordChars[j] = wordChars[wordChars.length-1-j];
				wordChars[wordChars.length-1-j] = temp2;
				
			}
			
			String wordReversed = new String(wordChars);
			strRev += wordReversed+" ";

		}
		System.out.println(strRev);

	//	System.out.println("===========3===============");
		//System.out.println(Arrays.toString(words));

	}

}
