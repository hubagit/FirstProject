package day21_april2;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		// WARM UP
//
//		ASK USER TWO NUMBER
//
//		KEEP ASKING UNTIL THE SUM OF
//		TWO NUMBERS ARE MORE THAN 100
//
//		PTINT THE END AFTER THE LOOP
//
//		OPTIONAL : 3 ATTEMPS ONLY
		int sum = 0;
		int x = 0;
		while (!(sum > 100)) {
			System.out.println("enter  two numbers:");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1 + num2;
			x++;
			if (x == 3)
				break;
		}
		System.out.println("End");

	}

}
