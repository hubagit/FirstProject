package day25_april9;

public class GetTheStringItemWithMaxLength {

	public static void main(String[] args) {

		String[] movies = new String[4];
		movies[0] = "Life";
		movies[1] = "without";
		movies[2] = "love is";
		movies[3] = "meaningless";
		// get the location of the word with max length
		// then just use that index to get the word
		/*
		 * max = 4 Iteration 1 : 7 > 4 ---> max = 7 index = 1 Iteration 2 : 7 > 7 --->
		 * max = staySame index = 1 Iteration 3 : 11 > 7 ---> max = 11 index = 3
		 * 
		 */
		int max = movies[0].length();
		int index = 0;
		for (int i = 0; i < movies.length; i++) {
			if (movies[i].length() > max)
				max = movies[i].length();
			index = i;
		}

		System.out.println(index);
		System.out.println(movies[index]);

	}

}
