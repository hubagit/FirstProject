package day24_april7;

import java.util.Scanner;

public class ScannerAndArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];

//		System.out.println("Enter number:");
//		arr[0] = scan.nextInt();
//		System.out.println("Enter number:");
//		arr[1] = scan.nextInt();
//		System.out.println("Enter number:");
//		arr[2] = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number " + (i + 1));
			arr[i] = scan.nextInt();
			System.out.println(arr[i]);
		}
		// BAD WAY TO GET THE MAX
		// INITIAL VALUE PREFERRABLY THE FIRST ITEM
//	    int max = 0 ; 
//	    for (int i = 0; i < arr.length; i++) {
//	      
//	      if(arr[i]> max  ) {
//	        max = arr[i] ; 
//	      }
//	      
//	    }
//	    System.out.println(max);

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("min valuue is " + min);

	}

}
