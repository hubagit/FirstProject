package day25_april9;

import java.util.Arrays;

public class Warmup {

	public static void main(String[] args) {
		// Arrays is class specifically designed for working on array object
		// with many pre-defined methods

		// Arrays.toString(yourArrayObjectInHere)-->>[item1,item2,...lastItem]

		//==============================================
		// create an array of int with capacity of 50
		// store 1-50 inside
		// print them out

		int[] nums = new int[50];
//		nums[0]=1;
//		nums[1]=2;
//		nums[2]=3;
//		nums[3]=4;
//		nums[4]=5;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		System.out.println(Arrays.toString(nums));
		System.out.println("=============================");

//		nums[0]=0;
//		nums[1]=2;
//		nums[2]=4;
//		nums[3]=6;
//		nums[4]=8;
//		....
//		nums[50]=100;

		// create another array of int with capacity of 50
		// store even numbers from 0-100 inside
		// print them out

		int[] evenNumbers = new int[51];
		for (int i = 0; i <= nums.length; i++) {
			evenNumbers[i] = i * 2;
		}

		System.out.println(Arrays.toString(evenNumbers));

		System.out.println("=============================");

		int[] oddsNumbers = new int[50];
		for (int i = 0; i < nums.length; i++) {
			oddsNumbers[i] = i * 2 + 1;
		}

		System.out.println(Arrays.toString(oddsNumbers));

	}

}
