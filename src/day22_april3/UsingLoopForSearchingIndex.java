package day22_april3;

public class UsingLoopForSearchingIndex {

	public static void main(String[] args) {

		String str = "ABCAA";
		String str2 = "";
		int x = 0;
		while (x < str.length()) {
			str2 = str.substring(x, x + 1);
			if (x != str.length() - 1)
				System.out.print(str2 + "-");
			else
				System.out.print(str2);
			x++;

			// System.out.println(str2 + ((x != str.length() - 1)?"-":""));

		}

	}

}
