package day19_march30;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.nextLine();

//		int x = 0;
//		while(x<word.length()) {
//			System.out.print(word.charAt(x)+"-");
//			x++; //++x;
//			
//		}

		int count = word.length();
		while (count - 1 >= 0) {
			System.out.print(word.charAt(count - 1) + " ");
			count--;

		}

//		int count = word.length();
//		while (count > 0) {
//		count--;
//		System.out.print(word.charAt(count - 1) + " ");
//			
//
//		}

	}

}
