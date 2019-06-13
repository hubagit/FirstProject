package day26_april10;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {

		String shows = "Orville, Game of Throne, X-man, Gifted, Breaking bad";

		String[] showsArray = shows.split(", ");
		System.out.println(Arrays.toString(showsArray));
		System.out.println("=============1================");
		for (int i = 0; i < showsArray.length; i++) {
			System.out.println(showsArray[i]);
		}

		System.out.println("=============2================");
		System.out.println(showsArray[1]);

		System.out.println("=============3================");
		System.out.println(showsArray[showsArray.length - 1]);

		System.out.println("=============4================");
		String[] showsArray2 = shows.split("Game of Throne");
		System.out.println(Arrays.toString(showsArray2));

		System.out.println("=============5================");

		for (int i = 0; i < showsArray2.length; i++) {
			System.out.println(showsArray2[i]);
		}
	}

}
