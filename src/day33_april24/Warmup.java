package day33_april24;

public class Warmup {

	public static void main(String[] args) {

		/*
		 * 
		 * Create a static method getSum accept 1 paramter as int array and return the
		 * sum of the all the items in array
		 * 
		 * another method called addAll accept 1 paramter as String array and return the
		 * concatenation of all items
		 * 
		 * another method called getMax accept 1 paramter as int array and return the
		 * max from the all the items in array
		 * 
		 */
		

		int[] nums1 = { 1, 2, 34, 4, 5, 6 };
		int sum1 = getSum(nums1);
		System.out.println(sum1);

		int max = getMax(nums1);
		System.out.println(max);

		String[] names = { "Mustafa", "Sungur" };
		String str1 = getAll(names);
		System.out.println(str1);

	}

	
	
	public static String getAll(String[] words) {
		String str = "";
		for (int i = 0; i < words.length; i++) {
			str += words[i] + " ";
		}
		return str;
	}

	public static int getSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;

	}

	public static int getMax(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		return max;

	}

}
