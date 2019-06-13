package day27_april13;

import java.util.Scanner;

public class ForEachLoopPractice {

	public static void main(String[] args) {
		
		/*
	     * ask user a word turn that word into a charArray then print out using for each
	     * loop Cybertek --> C-y-b-e-r-t-e-k-
	     */
		
		
		/*
	     * ask user for a sentence split it to get each word use for each loop to print
	     * out each word
	     */
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter a word:");
//		String word = scan.next();
//		
//		char[] myChars = word.toCharArray();
		
//		for (char c : myChars) {
//			System.out.print(c+"-");
//			
//		}
//		System.out.println();
//		
//		String[] splitted = word.split("");
//		for (String each : splitted) {
//			System.out.print(each+"-");
//		}
		
		
		
		
		System.out.println("Enter a sentence:");
		String sentence = scan.nextLine();
		
		String[] words = sentence.split(" ");
		
		for (String string : words) {
			System.out.println(string);
		}

	}

}
