package day20_march31;

public class Counter {

	public static void main(String[] args) {

		// how many letter of a showed up in this String
		String str = "jaaaavAword";

		// go through each and every char
		// if i see a, I will increment my counter by 1

		int count = 0;
		int x = 0;
		do {

			char c = str.charAt(x);
			if (c == 'a' || c=='A') {
				System.out.println("BINGO!"+x);
				++count;
			}
			// System.out.println(+" ");
			x++;

		} while (x < str.length());
		System.out.println(count);
	}

}
