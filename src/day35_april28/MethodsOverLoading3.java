package day35_april28;

import java.util.Arrays;

public class MethodsOverLoading3 {

	public static void main(String[] args) {

		/*
		 * passing 123 as argument for the method that has one int parameter
		 *
		 * method signature -->> method name + parameter list
		 *
		 */

		// 123 is argument
		doSomething(123);
		doSomething();

		
		//=====================================================
		String name = "Barry";
		char[] nameChars = name.toCharArray();
		System.out.println(Arrays.toString(nameChars));

		// getting each char as a aString
		String[] nameCharsStr = name.split("");
		System.out.println(Arrays.toString(nameCharsStr));

		Arrays.sort(nameCharsStr);
		System.out.println(Arrays.toString(nameCharsStr));
		
		
		String word = "mustafa";
		char[] myChars = word.toCharArray();
		System.out.println(Arrays.toString(myChars));
		
		String[] myString = word.split("");
		System.out.println(Arrays.toString(myString));
		
		Arrays.sort(myString);
		System.out.println(Arrays.toString(myString));

	}

	
		//======================================================
	
	
//	public static int doSomething(int x) {      // ==>>>>>>>>>>>> wrong!!!
//		System.out.println("do something 2");
//		return 0;
//	}
	
	// method parameter
	public static void doSomething(int y) {
		System.out.println("do something  23325");

	}

	public static void doSomething() {
		System.out.println("do something  23325");

	}
}
