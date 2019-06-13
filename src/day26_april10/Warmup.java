package day26_april10;

import java.util.Arrays;

public class Warmup {

	public static void main(String[] args) {

		// ====================================================

//		Write a program to find count of certain element in array 
//		Write a program to find unique element in array 
//		Eventually combining above two , write a program to find out frequency of unique elements in array

		// 3 ways to create an array
		// String str[] = new String[5];--> default value is null for each item
		// str[0] = "abc";

		String names[] = new String[5];// --> default value is null for each item
		names[0] = "abc";
		names[1] = "ef";
		names[2] = "gh";

		System.out.println(Arrays.toString(names));

		String[] names2 = new String[] { "aaa", "bbb", "", "ccc", };

		int x = 0;
		while (x < names2.length) {

			System.out.println(names2[x]);

			x++;
		}
		String[] names3 = { "asdads", "ssss0" };
		System.out.println("======================================");

		String names4 = "Sungur";
		char[] myChar = names4.toCharArray();

		System.out.println(Arrays.toString(myChar));
		char c = 'u';
		int count = 0;
		String uniqueElement = "";
		for (int i = 0; i < myChar.length; i++) {
			if (myChar[i] == c) {
				uniqueElement += c;
				count++;
			}

		}

		System.out.println(
				"Number of u in your String: " + count + "\n" + "unique element in your String is " + uniqueElement);
	}

}
