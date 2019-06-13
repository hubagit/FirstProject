package day11_march16;

import java.util.Scanner;

public class ConditionalAssignmemnt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter your score:");
		int score = scan.nextInt();
		String result;

//		if (score > 75) {
//			result = "pass";
//
//		} else {
//			result = "fail";
//		}
		
		//ternary Operator
		result = (score>60) ? "pass" : "fail"; 
				
		System.out.println("result is " + result);

	}

}
