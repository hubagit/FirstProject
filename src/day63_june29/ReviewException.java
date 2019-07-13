package day63_june29;

public class ReviewException {

	public static void main(String[] args) {

		try {
			 //System.out.println(6 / 0); //==> ArithmeticException obj is created
			  throw new ArithmeticException("6 is divided by 0");
			// int[] arr = {1,2};
			// System.out.println(arr[100]);

		} catch (ArithmeticException e1) {
			System.out.println("ArithmeticException happened");
			System.out.println(e1.getMessage()); //this will get the message along
			//with exception
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("ArrayIndexOutOfBoundsException happened");
		} catch (NullPointerException e3) {
			System.out.println("NullPointerException happened");
		}

		System.out.println("END!");
	}

}
