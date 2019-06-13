package day19_march30;

import java.util.Scanner;

public class LoopingChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter somethng: ");
		String str = scan.next();
		
		// how to check whether string starts with a-z
		
		char firstChar = str.charAt(0);
		
		//System.out.println('a'>'b'); //false
		
		
		if (firstChar>='a'  && firstChar<='z') {
			System.out.println("Lower case letters");
		}else {
			System.out.println("NOT a-z");
	
		
		
		
		
		
		}
			
	}

}
