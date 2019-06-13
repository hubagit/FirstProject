package day29_april16;

import java.util.Arrays;

public class MultiDArrayReview {

	public static void main(String[] args) {

		int[] nums1 = { 1, 45, 32, 10 };
		int[] nums2 = { 2, 5, 31 };

		int[] numsOfNum[] = new int[2][];

		System.out.println(Arrays.deepToString(numsOfNum));
		numsOfNum[0] = nums1;
		numsOfNum[1] = nums2;
		
		
		System.out.println(Arrays.deepToString(numsOfNum));
	}

}
