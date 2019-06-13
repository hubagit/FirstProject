package day34_april27;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		/*
		 * Create static a method called
		 * 
		 * getArrayFrom1toX it takes one parameter and return array starting from 1 to
		 * the number specified
		 * 
		 * getArrayFrom1toX(5) --> {1,2,3,4,5}
		 */

		int x = 15;

		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// System.out.println(Arrays.toString(arr));

		getArrayFrom1toX(x); // won't compile!!!
		getArrayFrom1toX(7); // won't compile!!!

		int[] resultArr = getArrayFrom1toX(x); //1st way
		System.out.println(Arrays.toString(resultArr));

		String arrInString = Arrays.toString(getArrayFrom1toX(7)); //2nd way
		System.out.println(arrInString);

		System.out.println(Arrays.toString(getArrayFrom1toX(17))); //3rd way

	}

	public static int[] getArrayFrom1toX(int x) {

		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		return arr;

	}

	

	

}
