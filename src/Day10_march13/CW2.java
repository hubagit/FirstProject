package Day10_march13;

import java.util.Scanner;

public class CW2 {

	public static void main(String[] args) {

		boolean isPrimeMember;
		double price;

		System.out.println("Welcome Amazon Shopper!");
		Scanner input = new Scanner(System.in);

		System.out.println("Are you a prime member?");
		isPrimeMember = input.nextBoolean();

		System.out.println("Enter the price: ");
		price = input.nextDouble();


		if (isPrimeMember) {
			System.out.println("This is your price: " + price);
		} else if (price > 35) {
			System.out.println("Your total price is : " + price);
		} else {
			price += 5;
			System.out.println("Your total price is; "+ price);
			//System.out.println("Your total price is: " +"$"+(price + 5));
			System.out.println("You may also consider joining prim to avoid shipping fee");
		}
	}

}
