package day27_april13;

import java.util.Arrays;

public class ArraysCopyOfRange {

	public static void main(String[] args) {
		String[] dcComicHeros = { "Superman", "Batman", "Aquaman", "Wonder Woman", "The Flash", "Green Lantern" };

		// copyRangeOf method takes 3 external data/parameters
		// original array, starting index inclusive and ending index
		// exclusive
		// store the resulting array into new array variable

		String[] copyOf1to3 = Arrays.copyOfRange(dcComicHeros, 1, 3);
		System.out.println(Arrays.toString(copyOf1to3));

		String[] copyOfWtoG = Arrays.copyOfRange(dcComicHeros, 3, 5+1);
		System.out.println(Arrays.toString(copyOfWtoG));

		String[] copyOfWto10 = Arrays.copyOfRange(dcComicHeros, 3, 10);
		System.out.println(Arrays.toString(copyOfWto10));
	}

}
