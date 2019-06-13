package day34_april27;

import java.util.Arrays;

public class VarArgs4 {

	public static void main(String[] args) {
		/// varArgs --is represented in method parameter using ...
		/*
		 * ... CAN ONLY BE USED AS METHOD PARAMTERS IT CAN NOT BE USED ANYWHERE ELSE
		 * 
		 * Calling a method that has varArg we directly pass variable number of
		 * arguments You may also pass an array --(not so common but possible)
		 * 
		 * What if we have more than one parameter in methods
		 * 
		 * * If there is multiple parameters VarArgs should be last one
		 * 
		 * Multiple varargs in one method parameters are not allowed, you can have at
		 * most one varArg in one method
		 * 
		 * 
		 * a method that takes varArg as parameter can accept an array object as an
		 * argument
		 * 
		 * a method that takes array as parameter can not accept a varArg as an argument
		 * 
		 */
		doSomething("magic horse", 1, 2, 3, 4, 45, 5, 6, 7, 8, 8, 9, 9);

//	    doSomethingElse(1,2,4,5,"Magic Horse"); 
//	    doSomethingElse(5,"Magic Horse");
		doSomething("magic horse", 1, 2, 3, 4, 54, 5, 6, 7, 7, 8, 9);

		// doSomethingElse(1,2,3,"magic horse"); -->> wrong!!!

		myMethod1("mustafa", "Sungur");

		System.out.println(Arrays.toString(myNums(1,2,3,5,6)));
		int[] mynums = (myNums(1,2,3,5,6));
		System.out.println(Arrays.toString(mynums));
		
		String myNums2 = Arrays.toString(myNums(1,2,3,5,6));
		System.out.println(myNums2);
	}

	public static void doSomething(String name, int... nums) {

		System.out.println("do something was called");

	}

	// if there is multiple parameters varArgs should be the last one
//	public static void doSomethingElse(int... nums, String name) {
//
//		System.out.println("do somethingElse was called");
//
//	} -->> wrong!!!

	public static void myMethod1(String... names) {

		String words = "";
		for (String eachWord : names) {
			words += eachWord + " ";

		}
		System.out.println(words);

	}

	public static int[] myNums(int... nums) {
		
		int[] myArr = new int [nums.length];
		
		for (int i = 0; i < myArr.length; i++) {
			myArr[i]=nums[i];
		} 
		
		
		return myArr;
		
		
		
		
	}
}
