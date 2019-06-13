package day30_april17;

public class MethodWithParameters {

	public static void main(String[] args) {

		// create a method called reportName
		// this method take 2 String parameters as firstName, lastName
		// return nothing
		// in the body -->
		// print the length of first and lastName with nice message
		// print the first initial of first and lastName together

//		String s = "abc";
//		System.out.println(s.substring(1,3));

//		printTheSum(10.5,20.9);		
//		printTheSum(123.9,200.1);		
//		printTheSum(11.33,44.1);		
//		printTheSum(11,5);

		reportName("Mustafa", "Sungur");
		reverseString("Mustafa");
		myEndlessMethod("Mustafa", "Sungur");

	}

//	public static void printTheSum(double a,double b) {
//		
//		double sum = a+b;
//		System.out.println("The sum of numbers is "+sum);
//	}

	public static void reportName(String name1, String name2) {
		System.out.println(
				"Length of " + name1 + " is " + name1.length() + ", length of " + name2 + " is " + name2.length());
		System.out.println("First initials: " + name1.charAt(0) + " " + name2.charAt(0));

	}

	public static void reverseString(String reversed) {
		for (int i = reversed.length() - 1; i >= 0; i--) {
			System.out.print(reversed.charAt(i) + " ");
		}
		System.out.println();
	}

	public static void myEndlessMethod(String word1, String word2) {

		String name = "";
		for (int i = word1.length() - 1; i >= 0; i--) {
			name += word1.charAt(i);
		}

		if (word1.equals(name))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
