package day62_june22;

public class MultiTryCatchBlock4 {

	public static void main(String[] args) {

		// StringIndexOutOfBoundsException , ArithmeticException

		System.out.println("Beiginning ");

		String str = "ABC";

		int num1 = 10;
		int num2 = 0;

		try {
			System.out.println("Try started");

			System.out.println(str.charAt(1));

			System.out.println(num1 / num2);

			System.out.println("Try Ended");

		} catch (StringIndexOutOfBoundsException ex1) {
			System.out.println("does not have that index ");
		}

		System.out.println("Ending ");
	}

}
