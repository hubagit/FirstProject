package day19_march30;

import java.util.Scanner;

public class WhileCharsClasswork {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter something: ");
		String str = s.next();
		char firstChar =str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
		if (firstChar>='0' && firstChar<='9') {
			System.out.println("Your sentence starts with a number");
		}else {
			System.out.println("Not a number");
		}

		if (lastChar>='A' && lastChar<='Z') {
			System.out.println("YOUR SENTENCE ENDS WITH AN UPPER CASE");
		}else {
			System.out.println("Not an upper case!");
		}
	}

}
