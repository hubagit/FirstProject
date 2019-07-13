package day63_june29;

public class ReviewException2 {

	public static void main(String[] args) {

		try {
			// System.out.println(6 / 0); //==> ArithmeticException obj is created
			throw new ArithmeticException("6 is divided by 0");
			// int[] arr = {1,2};
			// System.out.println(arr[100]);

		} catch (RuntimeException e) {
			//RuntimeException e = new ArithmeticException("6 is divided by 0");
			
			//ArrayIndexOutOfBoundsException e = new ArithmeticException("6 is divided by 0"); //NOT WORK!!!
			
			System.out.println("Exception happened");
		}

		System.out.println("END!");
	}

}
