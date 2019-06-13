package day31_april20;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		/*
		 * add two numbers       int 
		 * sub two numbers
		 * mult
		 * div
		 * mod 
		 * 
		 * add(100, 30)  -- print 130
		 * sub(100, 30)  -- print 70
		 * mult(100, 30)  -- print 3000
		 * div(100, 30)  -- print 3
		 * mod(100, 30)  -- print 10
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

//		int a = 100;
//		int b = 30;

		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		division(a, b);
		mod(a, b);

//		addition(100, 30);
//		subtraction(100, 30);
//		multiplication(100, 30);
//		division(100, 30);
//		mod(100, 30);

	}

	public static void addition(int a, int b) {
		System.out.println("result of addition of " + a + " and " + b + " is " + (a + b));
	}

	public static void subtraction(int a, int b) {
		System.out.println("result of subtraction of " + a + " and " + b + " is " + (a - b));
	}

	public static void multiplication(int a, int b) {
		System.out.println("result of multiplication of " + a + " and " + b + " is " + (a * b));
	}

	public static void division(int a, int b) {
		System.out.println("result of division of " + a + " and " + b + " is " + (a / b));
	}

	public static void mod(int a, int b) {
		System.out.println("result of mod of " + a + " and " + b + " is " + (a % b));
	}

}
