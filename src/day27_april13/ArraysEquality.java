package day27_april13;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 4, 65, 2 };
		int[] arr2 = { 1, 3, 4, 65, 2 };
		int[] arr3 = { 3, 1, 4, 65, 2 };

		// Comparing two variable
		// it will always check whether they have
		// same exact thing stored inside the variable

		System.out.println(arr1 == arr2);

		// Arrays has equal method to check whether 2 arrays
		// have same content or not
		boolean sameOrNot = Arrays.equals(arr1, arr2);

		System.out.println(sameOrNot);

		System.out.println("Arr2 compare to Arr3 "+Arrays.equals(arr2,arr3));
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println("Arr2 compare to Arr3 -- after sorting "+Arrays.equals(arr2,arr3));
	}

}
