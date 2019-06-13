package day21_april2;

public class CountingACharInForLoop {

	public static void main(String[] args) {

		String str = "AAccBBBdEEEf";
		// get unique char out of about String

		String newStr = "";

		// store first char into newStr
		// store the next char into newStr if it's not already there

//		newStr += str.charAt(0);
//
//		if (!newStr.contains(str.charAt(1) + "")) {
//			newStr += str.charAt(1);
//
//		}
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			String eachChar = str.charAt(i) + "";
			if (newStr.contains(eachChar)) {
				System.out.println(eachChar + " duplicate");
			} else {
				newStr += eachChar;
			}

		}

		System.out.println(newStr);

//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//
//		}

	}

}
