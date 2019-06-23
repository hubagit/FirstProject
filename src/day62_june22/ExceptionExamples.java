package day62_june22;

public class ExceptionExamples {

	public static void main(String[] args) {

		// IndexOutOfBoundException
		int[] nums = { 1, 5, 6 };
		System.out.println(nums[99]);

		// NullPointerException
		String str = null;
		// System.out.println(str.length());

		// ArithmaticException
		// System.out.println(10 / 0);

		// ClassCastException
		Object o = new Object();
		String oStr = (String) o;
		System.out.println(oStr);
	}

}
