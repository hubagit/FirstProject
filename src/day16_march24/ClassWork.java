package day16_march24;

import java.util.Scanner;

public class ClassWork {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a name: ");
		String name = sc.nextLine();

		boolean startsWith = name.startsWith("A");
		boolean endsWith = name.endsWith("x");

		int lastIndexOfLetterA = name.lastIndexOf("a");

		System.out.println(startsWith);
		System.out.println(endsWith);
		System.out.println(lastIndexOfLetterA);

		// optional

		int count = name.length();
		int midPoint = count / 2;

		if (count > 2)
			if (count % 2 == 1) {
				System.out.println(name.charAt((midPoint)));
			} else {
				System.out.println(name.substring(midPoint - 1, midPoint + 1));

			}
	}

}
