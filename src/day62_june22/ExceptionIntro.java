package day62_june22;

public class ExceptionIntro {

	public static void main(String[] args) {

		// EXCEPTIONS ARE OBJECT

		// ArrayIndexOutOfBoundsException
		// int[] nums = { 1, 5, 6 };
		// System.out.println(nums[99]);

//		ArrayIndexOutOfBoundsException aib = new ArrayIndexOutOfBoundsException();
//		System.out.println(aib);
//
//		 throw keyword ==> is used to throw exception manually
//		throw aib; 

		 int result = 10 / 0;
		 System.out.println(result);
		// There is another constructor in every exception that accepts String/
		// you can use it to provide more information about the case

		 ArithmeticException ae = new ArithmeticException("Do NOT Divide by 0");
		 throw ae;
		
		//throw new ArithmeticException("Bla Bla");

	}

}
