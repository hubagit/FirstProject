package Day10_march13;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long accountNumber;
		String passWord;

		System.out.println("Welcome to Cybertek Banking App");

		System.out.println("Enter your account number:");
		accountNumber = scan.nextLong();

		System.out.println("Enter your password:");
		passWord = scan.next();

		if ((accountNumber == 123456789) && (passWord.equals("abc"))) {
			System.out.println("Log-in success!");
		} else {
			System.out.println("log-in failed!");
		}

	}

}
