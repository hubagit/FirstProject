package day24_april7;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] nums = new int[10];

		for (int x = 0; x < 10; x++) {
			// int i = rand.nextInt(100); // 0 to 99
			nums[x] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(nums));
	}

}
