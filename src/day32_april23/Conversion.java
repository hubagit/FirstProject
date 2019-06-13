package day32_april23;

public class Conversion {

	public static void main(String[] args) {

		System.out.println(metertoCM(12));
		System.out.println(feetToInch(10));

		int cel = (int) faToCelcius(81);
		// the method return double -- double can not be saved in int variable
		// int cel = fahrToCel(81) ;
		// this is what we would do if we want to store the result in a variable
		double cel1 = faToCelcius(81);
		System.out.println(cel1);

		// new requirement:
		/*
		 * what if i want to get the result as int without changing the method return
		 * type to int but store the generated result as int
		 */

		// int cel = (int) 27.22222222222222 ;
		System.out.println(cel);

	}

	public static int metertoCM(int a) {

		return 100 * a;

	}

	public static double feetToInch(int b) {
		double inch = 12 * b;
		return inch;
	}

	public static double faToCelcius(double f) {

		return (f - 32) * 5 / 9.0;
	}

	// create a method called meterToCM
	// it takes one int as parameter and return CM

	// create a method called FeetToInch
	// it takes one int as parameter and return Inch as double

	// create a method called FaToCelcius
	// it takes one double as parameter and return celsius as double
}
