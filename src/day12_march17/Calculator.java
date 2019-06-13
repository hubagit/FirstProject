package day12_march17;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 2 numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("eNTER OPERATOR +, - , *, / ");
		String operator = scan.next();

		if (operator.equals("+")) {
			System.out.println(" addition the result is " + (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.println("substraction the result is " + (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.println("MULTIPILICATION RESULT IS " + (num1 * num2));
		} else if (operator.equals("/")) {
			System.out.println("the result is " + (num1 / num2));
		} else {
			System.out.println( );
		}

	}

}
