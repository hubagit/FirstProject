package day19_march30;

import java.util.Scanner;

public class DoWhileLoop2 {

	public static void main(String[] args) {

		// while loop
		// do while
		// for loop // for each loop

//	    int x = 1 ; 
//	    while(x<6) {
//	      System.out.println( x++ );
//	    }
		/*
		 * do { action to be repeated } while (a condition is true );
		 * 
		 * COMPARE TO WHILE LOOP Do while loop check the condition after the first
		 * iteration
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the target");

		int y = 1;
		int target = scan.nextInt();

		do {

			System.out.print(y + " ");
			y += 2;

		} while (y <= target);
		

		System.out.println();

		System.out.println("y value: " + y); 
		do {
			y -= 2;
			System.out.print(y + " ");
		} while (y > 1);

		
	}

}
