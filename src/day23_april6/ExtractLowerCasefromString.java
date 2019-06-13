package day23_april6;

public class ExtractLowerCasefromString {

	public static void main(String[] args) {

		String str = "5 Little Monkey Jumping on the Bed";

//		char eachChar = 'h';
//		System.out.println(eachChar >= 'a');
//		System.out.println(eachChar <= 'z');
//
//		if(eachChar>='a' && eachChar<='z') {
//			System.out.println("It's lowercase");

//		}
//	System.out.println("The End!");

		String allLowerCaseStr = "";
		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i);
			if (each >= 'a' && each <= 'z')
				allLowerCaseStr += each;
		}

		System.out.println(allLowerCaseStr);

	}

}
