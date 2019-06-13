package day23_april6;

import java.util.Scanner;

public class Printa_z {

	public static void main(String[] args) {

//		char a = 'a';
//		System.out.println(a+1);
//		char next = (char) (a+1);
//		System.out.println(next);
//		

//		for (int i = 'a'; i <= 'z'; i++) {
//			char eachChar = (char) i;
//			System.out.print(eachChar);
//
//		}

		// write a program to print all the char from beginning char
		// to ending char
		// if beginning character is before ending character
		// just print in low to high order
		// if ending character is before beginning char
		// then print in high to low order

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.next();
		String str1 = "";
		String str2 = "";
		String str3 = "";
		for (int i = 0; i < word.length() - 1; i++) {
			for (int j = 0; j <= i; j++) {

				if (word.charAt(i) < word.charAt(i + 1)) {

					char c1 = word.charAt(i);
					str1 += c1;
					//System.out.println(str1);
				} else {
					char c2 = word.charAt(i);
					str2 += c2;
					//System.out.println(c2);
				}
				
			}
			System.out.print(str1+str2);
		}

	}

}
