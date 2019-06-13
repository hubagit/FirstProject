package day22_april3;

public class SubStringWithLoop {

	public static void main(String[] args) {

		String str = "ABCDEFGHIJK";

		for (int i = 0; i < str.length(); i += 2) {

			if (i != str.length() - 1)

				System.out.print(str.substring(i, i + 2) + " ");
			else
				System.out.println(str.substring(i));

		}
		System.out.println();
		for (int i = 0; i < str.length(); i += 3) {

			if (i != str.length() - 2)

				System.out.print(str.substring(i, i + 3) + " ");
			else
				System.out.println(str.substring(i));
		}
	}
}
