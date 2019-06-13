package day21_april2;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * TASK 2.3 OPTIONALLY : 3, skip all numbers divisible by 3 and 5 at the same
		 * time 4, get the sum of above numbers
		 * 
		 * 
		 */
		int sum = 0;
		for (int i = 1; i < 50; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				continue;
			}

			System.out.print(i + " ");
			sum += i;
		}

		System.out.println();
		System.out.println(sum);

	}

}
