package day18_march27;

import java.util.Scanner;

public class SayILovejava {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String theAnswer = "";

		while(!theAnswer.equalsIgnoreCase("yes")) {
			System.out.println("DO you love java?");
			theAnswer = scan.nextLine();
		}
		
		System.out.println("Finally, correct answer!");
	}

}
