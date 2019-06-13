package day22_april3;

public class SubStringWithLoop2 {

	public static void main(String[] args) {

		String str = "ABCDEBC";

		// ABCDEBC -->> AB BC CD DE EB BC

		// COUNT THE NUMBER OF BC ON THIS STRING

		int count = 0;
		int countOfChars = str.length();
		String target = "BC";
		int targetLength = target.length();

		for (int i = 0; i < str.length() - 1; i++) {
			String word = str.substring(i, i+2);

			System.out.println(word);
			if (word.equals(target))
				++count;
			// System.out.println(i);
		}

//		for (int i = 0; i < str.length() - 1; i++) {
//			String twoChar = str.substring(i, i + 2);
//
//			System.out.println(twoChar);
//			if(twoChar.equals("BC")  )
//				count++;
//		}
		System.out.println(count);
	}

}
