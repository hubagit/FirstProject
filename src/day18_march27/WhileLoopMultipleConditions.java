package day18_march27;

import java.util.Scanner;

public class WhileLoopMultipleConditions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = scan.nextInt();
		int y = 1;
		while (y <= x) {
			System.out.print(y + " ");
			y++;
		}
		//System.out.println();
		System.out.println();
		System.out.println("END");
	}

}
