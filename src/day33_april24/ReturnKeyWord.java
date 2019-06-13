package day33_april24;

import java.util.Scanner;

public class ReturnKeyWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();

		// once return keyword is reached, method finish 
		if (num < 0) {
			return;
		}

		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
	}

}
