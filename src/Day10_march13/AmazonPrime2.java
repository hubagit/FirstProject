package Day10_march13;

import java.util.Scanner;

public class AmazonPrime2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Amazon");

		System.out.println("whats the price in your cart");
		double price = scan.nextDouble();

		System.out.println("are you a prime member");
		String isPrimeMember = scan.next();


		if (price < 35) {

			if (isPrimeMember.equalsIgnoreCase("yes")) {
				System.out.println("YOU STILL GOT FREE SHIPPING " + price);
			} else {
				price += 5;
				System.out.println("YOU gotta pay 5 $ shipping " + price);
			}

		} else {
			System.out.println("YOU STILL GOT FREE SHIPPING " + price);

		}
	}
}
