package day37_may1;

public class WrapperClass {

	public static void main(String[] args) {

		Byte b = new Byte((byte) 123);
		Float f = new Float(23.6);

		printByteValue((byte) 10);

		byte b1 = 12;
		printByteValue(b1);

		long lval = 10; // upcasting or type widening
		// 10 is literally considered as int
		// 10 becomes ==> 10L and stored inside long variable

		Long lRef = 10L; // auto boxing==> 10L becomes new Long(10L)
		// as an object and assigned to lref

		// reference type does not care about the range
		// it only cares about the relationship between types
		// range compatible assignment only works for primitive numbers
		// Long lRef2 = new Integer(10); ==> this does not work!!!

		// This always misleads programmer to think as blow
		// 10==>10L by type widening or upcasting
		// and then 10L autoboxed to long Object
		// BIG NO!!!!!
		// Compiler is lazy ==> it only takes one step!
		// For example: It either only takes action of
		// 10==>> 10L or 10==> new Integer(10)
		// big BAD !!! COMMON TRICKY EXAM OR INTERVIEW QUESTION
		// Long lref3 = 10;

		Double d = 3.14; // auto boxing

		// compiler can not turn int 3 into Double object in one step
		// and compiler only wants to take one step so it does not work
		// STEP 1 = 3==> 3.0d upcasting
		// STEP 2 = 3.0d==>new Double(3.0) //autoboxing
		// BIG BAD
		// Double badD = 3;

		Short s = 3;
		Byte b3 = 3;
	}

	public static void printByteValue(byte b) {

		System.out.println(b);

	}
}
