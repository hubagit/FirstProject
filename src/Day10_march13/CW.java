package Day10_march13;

import java.util.Scanner;

public class CW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your score: ");

		int score = scan.nextInt();

		if (score > 100 || score < 0) {
			System.out.println("Invalid number");
		} else if (score >= 90) {
			System.out.println("You got an \"A\".");
		} else if (score >= 80) {
			System.out.println("you got a \"B\".");
		} else if (score >= 70) {
			System.out.println("you got a \"C\".");
		} else {
			System.out.println("\"Study harder!\"");
		}

//		if (score >= 90) {
//			System.out.println("You got an \"A\".");
//		}if (score >= 80 && score<90) {
//			System.out.println("you got a \"B\".");
//		} if (score >= 70 && score<80) {
//			System.out.println("you got a \"C\".");
//		
//		}

	}

}
