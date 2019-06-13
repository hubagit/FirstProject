package day8_march_10;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double priceOfIphone = 599.99;
		double priceOfIpad = 899.99;

		System.out.println("Enter iphone count: ");
		int phoneCount = input.nextInt();
		System.out.println("Enter ipad count: ");
		int ipadPrice = input.nextInt();
		System.out.println("Enter your budget: ");
		double yourBudget = input.nextDouble();

		double totalPrice = (double) ((int) (priceOfIphone * phoneCount) + (priceOfIpad * ipadPrice));
		
		System.out.println("total price is " + totalPrice);

		if (totalPrice > yourBudget) {
			System.out.println("Sorry, it is out of your budget!");
			System.out.println("You need extra " + (totalPrice - yourBudget));
		} else {
			System.out.println("I will take it!");
		}

	}

}
