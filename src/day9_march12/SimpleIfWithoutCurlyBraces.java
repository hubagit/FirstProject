package day9_march12;

import java.util.Scanner;

public class SimpleIfWithoutCurlyBraces {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers ");

		int x = sc.nextInt();

//		if (x != 10)
//			System.out.println("Not 10!");
//		else
//			System.out.println("Yes it is 10!");

		
		// if there is only one statement, no need to use curly braces.
		if (x != 10) {
			System.out.println("Not 10!");
		} else {
			System.out.println("Yes it is 10!");
			System.out.println("Yes it is 10 as I said");
		}
	}

}
