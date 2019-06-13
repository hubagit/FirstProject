package day27_april13;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] nums = { 1, 22, 567, 11, 22 };

		for (int i = 0; i < nums.length; i++) {
			int eachItem = nums[i];
			// System.out.println(eachItem);
		}

		// for each loop syntax
		/*
		 * for (eachItemDataType name : collectionVariable ) { your action here }
		 *
		 * for each loop or enhanced for loop
		 * 
		 * for each loop can only be used for looping through collection type in this
		 * particular example it's an array
		 */
		for (int eactItem : nums) {

			// System.out.println(eactItem);

		}

		String[] names = { "Mustafa", "Sungur", "java", "is", "fun!" };

		for (String words : names) {

			System.out.println(words);
		}
	}

}
