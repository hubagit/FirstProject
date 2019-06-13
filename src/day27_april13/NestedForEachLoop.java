package day27_april13;

import java.util.Scanner;

public class NestedForEachLoop {

	public static void main(String[] args) {
		 /*
	     * Optional : use combine above two for each loop to finish our previous tasks
	     * 
	     */
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a sentence");
		String sentence = scan.nextLine();
		String[] words = sentence.split(" ");

		for (String eachWord : words) {

			// System.out.println(eachWord);
//	      String word = "Break time" ; 
			char[] wordChars = eachWord.toCharArray();
			for (char c : wordChars) {
				System.out.print(c + "-");
			}
			System.out.println();

		}

	}

}
