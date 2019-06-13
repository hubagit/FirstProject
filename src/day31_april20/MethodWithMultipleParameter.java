package day31_april20;

import java.util.Scanner;

public class MethodWithMultipleParameter {

	public static void main(String[] args) {

		repeat("java", 5);
		repeat("spartan", 3);
//		repeat(); wrong!!!
//		repeat("abc");wrong!!!
//		repeat("abc",123.345,true);wrong!!!

		Scanner scan = new Scanner(System.in);

		System.out.println("Give me a word to be repeated: ");
		String str = scan.next();

		System.out.println("Give me a number of time to be repeated: ");
		int i = scan.nextInt();

		repeat(str, i);
	}

	public static void repeat(String word, int num) {

		for (int i = 0; i < num; i++) {
			System.out.print(word + " ");
		}
		System.out.println();

	}
}
