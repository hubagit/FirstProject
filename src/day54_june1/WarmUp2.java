package day54_june1;

import java.util.Random;

public class WarmUp2 {

	// How can we initialize fields value
	/*
	 * if no action is taken , default value will be provided
	 * 
	 * 1) we can directly assign value with value or we can call a method
	 * 
	 * 2) it can be initialized in initializer block
	 * 
	 * 3) it can be initialized in constructor
	 * 
	 */

	int num = getANumber(); // 100;
	//int number = getAnotherNumber();
	
//	public int getAnotherNumber() {
//		return 10;
	
	//Random rand = new Random();
	// int number = rand.nextInt(10);
	//return number;
//	}

	public static void main(String[] args) {

		WarmUp2 w = new WarmUp2();
		System.out.println(w.num);
		
		//System.out.println(w.number);

	}

	public int getANumber() {

		Random r = new Random();
		int number = r.nextInt(100);
		return number;
	}
}
