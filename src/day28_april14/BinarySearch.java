package day28_april14;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 6, 11, 19, 20, 54 };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		// array object must be sorted before using this method

		int index = Arrays.binarySearch(nums, 5);
		System.out.println(index);

		int index20 = Arrays.binarySearch(nums, 20);
		System.out.println(index20);

		// if we don't have the item in the array we will get minus number to
		// point the insertion point of the array to keep this arr sorted

		int index10 = Arrays.binarySearch(nums, 10);
		System.out.println(index10);

		int index100 = Arrays.binarySearch(nums, 100);
		System.out.println(index100);

		// { 4, 5, 6, 11, 19, 20, 54};-->> add 10 to this array if not existed

		int index3 = Arrays.binarySearch(nums, 3);
		System.out.println(index3);

		int[] nums100 = new int[100];
		Arrays.fill(nums100, 5);
		System.out.println(Arrays.toString(nums100));

	}

}
