package day26_april10;

import java.util.Arrays;

public class SplittingTheStrings {

	public static void main(String[] args) {

		// split method from String class is used to split up into
		// Multiple pieces according to the delimiter that provided
		// and return it as String array
		// if the given delimiter does not exist in the string
		// it will return a string array of size 1 with original String inside
		// ===================================================

		String str = "java is fun, java is challenging";

		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));

		System.out.println("======================");
		
		String[] parts = str.split("a");
		System.out.println(Arrays.toString(parts));
		System.out.println("======================");
		String[] parts2 = str.split("is");
		System.out.println(Arrays.toString(parts2));
		System.out.println("======================");
		// create a string called groceries
		// add items separated by comma
		// split them and print them out
		// find out size of split
		// find out length of each item

		String groceries = "apple, orange, milk, butter, eggs";
		String[] groceryItems = groceries.split(",");

		System.out.println(Arrays.toString(groceryItems));
		System.out.println("======================");
		System.out.println(groceryItems.length);
		System.out.println("======================");
		for (int i = 0; i < groceryItems.length; i++) {
			System.out.println(groceryItems[i].trim().length());
		}

	}

}
