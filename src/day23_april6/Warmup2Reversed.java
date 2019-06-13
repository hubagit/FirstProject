package day23_april6;

import java.util.Scanner;

public class Warmup2Reversed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word to be reversed: ");
		String str = scan.next();
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.substring(i, i + 1));

		}
		System.out.println();
		for (int i = str.length()-1; i >= 0; i--) {

			reversed += str.substring(i, i + 1);

		}
	
	System.out.println(reversed);
	}

}
