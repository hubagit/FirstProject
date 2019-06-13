package day36_april30;

public class StringToPrimitivesOrObject {

	public static void main(String[] args) {

		/*
		 * From String to primitives parseX method will take String and return ==>
		 * primitive value
		 */

		String str1 = "True";
		boolean b1 = Boolean.parseBoolean(str1);
		boolean b2 = Boolean.parseBoolean("ABC");
		boolean b3 = Boolean.parseBoolean("TRUE");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		String str2 = "123";
		int i = Integer.parseInt(str2);
		long l = Long.parseLong(str2);
		double d3 = Double.parseDouble(str2);

		/*
		 * From String to Wrapper Class Object valueOf method will take String and
		 * return ==> Wrapper class object
		 */

		String d = "3.14";
		Double d1 = Double.valueOf(d);
		System.out.println(d1.toString());
		
		Integer i3 = Integer.valueOf(d);
		Float f3 = Float.valueOf(d);

		Integer i4 = 10; //auto boxing
		double d2 = d1; // auto unboxing

		// invalid conversion
		// System.out.println(Double.parseDouble("3.14abc"));

		System.out.println(Integer.valueOf("3"));

	}

}
