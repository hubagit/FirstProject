package day12_march17;

import java.util.Scanner;

public class CalculatorWithSwitch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 2 numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("ENTER OPERATOR +, - , *, / ");
		String operator = scan.next();

		switch (operator) {
		case "+":
			System.out.println("addition the result is " + (num1 + num2));
			break;
		case "-":
			System.out.println("substraction the result is " + (num1 - num2));
			break;
		case "*":
			System.out.println("MULTIPILICATION RESULT IS " + (num1 * num2));
			break;
		case "/":
			System.out.println("division the result is " + (num1 / num2));
			break;
		default:
			System.out.println("INVALID OPERATOR!");
			break;

		}
	}

}
