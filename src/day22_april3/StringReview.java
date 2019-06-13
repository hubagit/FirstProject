package day22_april3;

public class StringReview {

	public static void main(String[] args) {

		String str = "Java String is Awesome";
		int count = str.length();
		int lastIndex = count - 1;

		System.out.println("How many char: " + count);
		System.out.println("Last char index : " + lastIndex);

		// getting the index of word String

		int indexOfWordString = str.indexOf("String");
		System.out.println(indexOfWordString);

		// what if we have more than one
		int indexOfA = str.indexOf("A"); // first occurrence

		System.out.println(indexOfA);

		String part = str.substring(12, 14);
		System.out.println(part);
		System.out.println(str.substring(1, 6));

		int indexOfFirstA = str.indexOf("a");
		System.out.println(str.indexOf(indexOfFirstA));

		// indexOf(string, beginning index)
		int indexOfScondA = str.indexOf("a", indexOfFirstA + 1);
		System.out.println(str.indexOf(indexOfScondA));
		
		
		
		
		
		
		
		

	}

}
