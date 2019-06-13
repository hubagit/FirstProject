package day30_april17;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// Task 2
		/*
		 * 2.1 create a static method with no return type called printTheDoubledNumber
		 * it takes 1 int as parameter and it will print out doubled number on the
		 * console
		 * 
		 * 2.2 create another static method with no return type called checkForAge it
		 * takes 1 int age as parameter inside body , check whether the age is more than
		 * 18 if the age is more than 10 --> print adult if not print not an adult
		 * 
		 */

		doubleNumber(10);
		doubleNumber(3);

		int i = 15;
		CheckForAge(21);
		CheckForAge(i);
		CheckForAge(18);
	}

	// int num is called method parameters
	public static void doubleNumber(int num) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number to be doubled: ");
//		num = scan.nextInt();
		System.out.println(2 * num);
	}

	public static void CheckForAge(int age) {
		if (age > 18)
			System.out.println("Adult");
		else
			System.out.println("Not an adult!");
	}

}
