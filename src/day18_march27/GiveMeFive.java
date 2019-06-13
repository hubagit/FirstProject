package day18_march27;

import java.util.Scanner;

public class GiveMeFive {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int x=10 ;
//
//		while (x != 5) {
//			System.out.println("Give me 5!");
//			x = scan.nextInt();
//
//		}
//
//		System.out.println("YAY GOOD JOB!");

		// as long as i don't get 5 or 10 I keep asking
		int x = 0;
		// while ((x != 5 && x != 10))
		while (!(x == 5 || x == 10)) {
			System.out.println("Enter 5 dollars or 10 dollars:");
			x = scan.nextInt();
		}

		System.out.println("Finally, you entered!");

	}

}
