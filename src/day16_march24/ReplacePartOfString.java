package day16_march24;

import java.util.Scanner;

public class ReplacePartOfString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		String str = "Date is 03_25_2019";
//		
//		str = str.replace("_", "-");
//		
//		System.out.println(str);
//		
//		str = str.replace("is", "will be");
//		System.out.println(str);
//		
//		// date will be 03-25-2019 -->>03-25-2019
//		System.out.println(str.replace("Date will be ", ""));
		String education = "";
		System.out.println("Have you had continuous insurance for the past 12 months?");
		String continuousInsurance = scan.nextLine();
		
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();
		education = education.replace(" ", "");
		
		System.out.println(education);
		
		
		
		
		
		
//		String str2 = "AAAAABBBBBCCCCCC";
//		System.out.println(str2.replace("A","Z"));
	}

}
