package day29_april16;

import java.util.Scanner;

public class MethodWithParameter {

	public static void main(String[] args) {

		// Arrays.sort(arr);
		holdYourHorse("Mustafa");
		// holdYourHorse(111111); // doesn't Compile if data type not match
		
		holdYourHorse("Sungur");
		holdYourHorse("Zuha");
		holdYourHorse("Zehra");

//		Scanner scan = new Scanner(System.in);
//		String name = scan.next();
//		System.out.println("Hold whose horse?");
//		holdYourHorse(name);
		
		
		newMethodWithNumbers(571);
		
		
	}

	// parameter
	public static void holdYourHorse(String owner) {
		//String owner1 = "Mustafa";
		System.out.println(owner + ", hold your horse please!");
	}

	public static void newMethodWithNumbers (int numbers) {
		//int numbers1 = 121343;
		System.out.println(numbers);
	}
}
