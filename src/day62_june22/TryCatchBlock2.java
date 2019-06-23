package day62_june22;

public class TryCatchBlock2 {

	public static void main(String[] args) {
		// Try catch block is used to wrap up a piece of code that is anticipated to throw
		// certain type of exception
		// and catch the exception that happen if it happen
		// and and either try to recover from it or just report it
		// so the program does not shutdown and continue to execute

		// write a piece of code that
		// you anticipate to throw ArrayIndexOutOfBoundsException
		// and put it under try catch block so it does not shutdown when it happen
		System.out.println("Beginning of the code ");

		int[] arr = { 1, 2, 3, 4 };
		try {

			System.out.println(arr[100]); // -->> new ArrayIndexOutOfBoundsException();
			System.out.println("End of try block");

			// ArrayIndexOutOfBoundsException aibe = new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException aibe) {

			System.out.println("out of bound happen , This is catch block message");
			// here is the scenario , if this exception happen
			// IF JUST WANT TO PRINT LAST ITEM OF THE ARRAY
			System.out.println("just returning last item instead : ");
			System.out.println(arr[arr.length - 1]);

		}

		System.out.println("Ending of the code "); 

	}

}
