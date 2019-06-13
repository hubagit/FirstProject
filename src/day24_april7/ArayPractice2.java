package day24_april7;

public class ArayPractice2 {

	public static void main(String[] args) {

		// print them out using the loop

		// OPTIONALLY SWAP the value of first and last items --> {9,.....,1}

		int[] numbers = { 571, 632, 1071, 1299, 1453 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		numbers[2] = numbers[2] * 2;

		numbers[3] = numbers[0] + numbers[1];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		numbers[0] = 571;
		numbers[4] = 1453;

		int temNumber = numbers[0];
		numbers[0] = numbers[4];
		numbers[4] = temNumber;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		// get the sum of all numbers
		// get the max number
		System.out.println();
		System.out.println("======================");
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
		System.out.println("======================");

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max);
		/*
		 * // we assume the first item is the max then compare the first item to the
		 * rest of them and replace the value of max with actual max number in each
		 * iteration max 1 iteration 1 ---> 4>1 ----> max 4 iteration 2 ---> 6>4
		 * ---->max 6 iteration 3 ---> 8>6 ----> max 8 iteration 4 ---> 9>8 ----> max 9
		 * iteration 5 ---> 5>9 false ----> max 9
		 * 
		 * 
		 */
		System.out.println("========Finding smallest item in array===========");

		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		System.out.println(min);

	}

}
