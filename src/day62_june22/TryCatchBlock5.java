package day62_june22;

import java.util.Scanner;

public class TryCatchBlock5 {

	public static void main(String[] args) {
		// Try catch block is used wrap up a piece of code that aniticipated to throw
		// certain type of exception
		// and catch the exception that happen if it happen
		// and and either try to recover from it or just report it
		// so the program does not shutdown and continue to execute

		System.out.println("Beginning of the code ");

		String str = "ABC";

		int num1 = 10;
		int num2 = 0;

		try {
			System.out.println("Try started");

			System.out.println(str.charAt(1)); // -->> new StringIndexOutOfBoundsException()

			System.out.println(num1 / num2); // -->> new ArithmeticException()

			System.out.println("Try Ended");
			// RuntimeException is super class of StringIndexOutOfBoundsException,
			// ArithmeticException
			// question , can we change below catch to catch RuntimeException
		} catch (Exception ex) {

			// Exception ex = new StringIndexOutOfBoundsException();
			// Exception ex = new ArithmeticException();
			System.out.println("The message : " + ex.getMessage());

			System.out.println("SOME EXCEPTION HAPPEN");
		}

		System.out.println("Ending of the code ");

	}

}
