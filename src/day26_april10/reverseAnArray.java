package day26_april10;

import java.util.Arrays;

public class reverseAnArray {

	public static void main(String[] args) {

//		early warm up task : write an program to reverse an array : {11,2,39,7,4,15} —-> {15,4,7,39,2,11} *Work with same array object you created and do not create new array object* 
//		Try same logic for char array , string array

		int[] numbers = { 11, 2, 39, 7, 4, 15 };
		System.out.println(Arrays.toString(numbers));

		int count = numbers.length;
		int lastIndex = count - 1;

		for (int i = 0; i < count / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[lastIndex - i];
			numbers[lastIndex - i] = temp;
		}

//		int temp = numbers[0];
//		numbers[0] = numbers[5];
//		numbers[5] = temp;
//
//		temp = numbers[1];
//		numbers[1] = numbers[4];
//		numbers[4] = temp;
//
//		temp = numbers[2];
//		numbers[2] = numbers[3];
//		numbers[3] = temp;
//
		System.out.println(Arrays.toString(numbers));

	}

}
