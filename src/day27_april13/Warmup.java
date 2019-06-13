package day27_april13;

import java.util.Arrays;

public class Warmup {

	public static void main(String[] args) {

		/*
		 * Saturday WARM UP Tasks :
		 * 
		 * //Task1 : create an array of int with 5 items , return true if all items are
		 * more than 10 return false if not
		 * 
		 * //Task 2 : given : String str =
		 * "Cybertek Batch Spartan is most hardworking Batch ever";
		 * 
		 * use the method your learned to get each words and store it into String array:
		 * 
		 * loop through each items -- in each iteratrion loop : turn each word into char
		 * array print each char out with seperated by - output : C-y-b-e-r-t-e-k-
		 * B-a-t-c-h- S-p-a-r-t-a-n- i-s- m-o-s-t- h-a-r-d-w-o-r-k-i-n-g- o-n-e-
		 * e-v-e-r-
		 * 
		 * // Optional : Reverse each word in sentence your output should be ketrebyC
		 * hctaB natrapS si tsom gnikrowdrah eno reve
		 */

//		int[] nums = { 571, 632, 1071, 1299, 1453 };
//		boolean test = true;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] > 10)
//				test = true;
//			else
//				test = false;
//		}
//		System.out.println(test);
		// ===========================================================
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String[] words = str.split(" ");

		// System.out.println(Arrays.toString(words));
		// ==========================================================
		char[] myChars = str.toCharArray();
		for (int i = 0; i < myChars.length; i++) {
			// System.out.print(myChars[i] + "-");
		}

//		for (int i = myChars.length - 1; i >= 0; i--) {
//			System.out.print(myChars[i] + " ");
//		}

		String reversedSentence = "";
		for (int i = 0; i < words.length; i++) {
			String oneWord = words[i];
			char[] myChars2 = oneWord.toCharArray();

			for (int j = 0; j < myChars2.length / 2; j++) {
				char temp = myChars2[j];
				myChars2[j] = myChars2[myChars2.length - 1 - j];
				myChars2[myChars2.length - 1 - j] = temp;

			}
			String reversed = new String(myChars2);
			reversedSentence += reversed + " ";
		}
		// System.out.println(Arrays.toString(myChars));
		// how to change char array to a String

		System.out.println(reversedSentence);
	}

}
