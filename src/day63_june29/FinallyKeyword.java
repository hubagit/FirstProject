package day63_june29;

public class FinallyKeyword {

	public static void main(String[] args) {
		// HOW CAN WE MAKE SURE PROGRAM END GRACEFULLY --
		// THE EXCEPTION OBJECT MUST BE CAUGHT BY A CATCH BLOCK
		// EVENTUALLY TO END OR CONTINUE YOUR PROGRAM GRACEFULLY

		// Objective: run certain code whether the exception is caught or not
		System.out.println("START ");
		try {
			System.out.println("Try block ");
			// This is the only time that finally does not get to execute because JVM
			// shutdown
			// System.exit(0);

			throw new RuntimeException();
			// UN REACHABLE CODE AND IT DOES NOT COMPILE
			// System.out.println("BAL BLA BLA ");

		} catch (ArithmeticException e) {
			// ArithmeticException e = new RuntimeException(); BAD !!!!
			System.out.println("caught");

			// A CODE run no matter we have caught the exception or not
			// FOR EXAMPLE : closing a resource after using them
			// closing browser whether we have exception or not
		} finally {
			System.out.println("This code run no matter we have caught the exception or not");
		}

		System.out.println("End ");

	}

}
