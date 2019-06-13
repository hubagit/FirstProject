package day19_march30;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = s.nextLine();

//		while (!sentence.contains("java")) //sentence,contains("java"==false)
		//{
//			
//			System.out.println("Enter a sentence: ");
//			sentence = s.nextLine();
//		}

//		while (!sentence.toUpperCase().contains("JAVA")) {
//
//			System.out.println("Enter a sentence: ");
//			sentence = s.nextLine();
//		}
		while (!sentence.toLowerCase().contains("java")) {

			System.out.println("Enter a sentence: ");
			sentence = s.nextLine();
		}
		
		System.out.println("You got \"Java\"");

		
	}

}
