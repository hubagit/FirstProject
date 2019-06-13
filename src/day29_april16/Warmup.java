package day29_april16;

import java.util.Arrays;

public class Warmup {

	public static void main(String[] args) {

		/*
		 * Create array of 2 Dimensional String Array , the pizza has 7 slice , each
		 * slice can be finished in 3 bites , each bite has different topping as color
		 * code on the right : total 21 toppings. Task 1.1 : create 2D String array to
		 * represent below scenario( using any one of 3 way to create and assign value
		 * to array) Task 1.2 : print out to see what’s inside using the Arrays class
		 * method Task 1.3 print all the value inside using for loop Task 1.4 print all
		 * the value inside using for loop and skip 3rd slice of pizza Task 1.5 print
		 * all the value inside using for loop and stop eating when you see banana
		 * pepper
		 * 
		 */

		String[][] pizza = { { "mushroom", "black olive", "green pepper" }, { "spinach", "green pepper", "mushroom" },
				{ "black olive", "black olive", "spinach" }, { "mushroom", "mushroom", "red pepper" },
				{ "banana pepper", "spinach", "red pepper" }, { "mushroom", "green pepper", "green pepper" },
				{ "spinach", "green pepper", "mushroom" } };

		System.out.println(Arrays.deepToString(pizza));
		System.out.println("=============1=============");
		// 2nd way to do
		for (String[] slice : pizza) {
			for (String topping : slice) {
				System.out.print(topping + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(pizza[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=============2=============");
		for (int i = 0; i < 7; i++) {

			System.out.println("Slice number : " + (i+1));
			if (i == 2)
				continue;
			for (int j = 0; j < 3; j++) {
				System.out.print(pizza[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("=============3=============");

		// labels -- used to label certain loop in nested loop 
		
		spartan:
		for (int i = 0; i < 7; i++) {

			System.out.println("Slice number : " + (i+1));
			
			for (int j = 0; j < 3; j++) {
				
			
			if(pizza[i][j].equals("banana pepper"))
				break spartan;
			System.out.print(pizza[i][j] + " | ");
			}
			System.out.println();
		}

	}

}
