package day31_april20;

import java.util.Arrays;

public class MethodThtaTaksArrayAsParameter {

	public static void main(String[] args) {

		/*
		 * methods : reusable code, maintainable code , write once and use it whenever
		 * needed
		 * 
		 * 3 questions to ask while creating a method :
		 * 
		 * does this method need an object or not when being called -->> if not we use
		 * static keyword does this method take external data or not -->> if it doesn't
		 * we just end method name with empty () -->> if yes put data type and name :
		 * parameters seperated by comma does this method return a value after being
		 * called --if not use void --if yes put the data type of the variable it returns
		 * 
		 */

		String s = "abc";
		System.out.println(s.charAt(0));
		
		System.out.println("================1=============");

		int[] arrObject = { 1, 2, 5, 6 };
		System.out.println(arrObject[3]);

		System.out.println("================2=============");

		// Arrays.sort(arr);

		// create a static method with no return type
		// take one int array as parameter and print them out in one line
		// with - in between

		int [] arrNums = new int[] {571,632,1071};
		arrayPrinterWithDash(arrNums);
		
		arrayPrinterWithDash(new int[] { 1, 2, 3, 5, 6, 5, 65 });
		System.out.println("================3=============");
		arrayPrinterWithDash(arrObject);

		System.out.println("================4=============");
		
		int[] num1 = { 571, 632, 1071 };
		int[] num2 = { 622, 1299, 1453, 2019 };
		reportBiggerarray(num1, num2);
		System.out.println("================5=============");
		reportBiggerarray(new int[] { 1,5,4 }, new int[] { 2, 4 });
	}

	public static void arrayPrinterWithDash(int[] manyItem) {

		for (int each : manyItem) {
			System.out.print(each + "-");
		}
		System.out.println();

	}

	public static void reportBiggerarray(int[] arr1, int[] arr2) {

		if (arr1.length > arr2.length)
			System.out.println(Arrays.toString(arr1));
		else
			System.out.println(Arrays.toString(arr2));

	}

}
