package day25_april9;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

		// create a string array of capacity of 4
		// put your favorite movie/show in

		// 1, first use loop print to them out

		// 2, print the length of all items

		// 3, get the max length movie title

		String[] movies = new String[4];
		movies[0] = "Life";
		movies[1] = "without";
		movies[2] = "love is";
		movies[3] = "meaningless";

		System.out.println(Arrays.toString(movies));
		// getting the count of array
		// we are using length property of array object
		System.out.println(movies.length);
		System.out.println(movies[0].length());

		System.out.println("===========================");

		for (int i = 0; i < movies.length; i++) {
			System.out.println(movies[i] + " char count is :" + movies[i].length());
		}

		System.out.println("===========================");

		int max = movies[0].length();
		for (int i = 1; i < movies.length; i++) {

			if (movies[i].length() > max) {
				max = movies[i].length();

			}
		}
		System.out.println(max);

	}

}
