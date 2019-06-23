package day62_june22;

import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("begining of the code ");

		Scanner scanner = new Scanner(System.in);
		// try/catch block is used to wrap up a piece of code that is anticipated
		// to throw certain type of exception and catch the exception that happens
		// if it happens
		// and either try to recover from it or just report it
		// so the program does not shutdown and continues to execute

		try {

			System.out.println("Enter num1: ");
			int num1 = scanner.nextInt();
			System.out.println("Enter bum2: ");
			int num2 = scanner.nextInt();

			System.out.println("Division result is " + num1 / num2);

			// we are specially trying catch ArithmeticException if it happens
		} catch (ArithmeticException e) {// new ArithmeticException();
			System.out.println("You input 0 for second number");
		}
		System.out.println("Ending of the code ");

	}

}
