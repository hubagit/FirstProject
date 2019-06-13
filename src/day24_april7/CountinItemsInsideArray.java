package day24_april7;

import java.util.Arrays;

public class CountinItemsInsideArray {

	public static void main(String[] args) {
		// first print put array to see what's inside
		// find the count of numbers more than 100
		
		int[] nums = { 1, 55, 7, 898, 9, 55,123,567 };

		System.out.println(Arrays.toString(nums));
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 100)
				count++;
		}
		System.out.println(count);

	}

}
