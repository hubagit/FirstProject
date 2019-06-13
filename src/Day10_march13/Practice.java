package Day10_march13;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Okta for Slack!");
		System.out.println("Enter the length of your username:");
		int lengthOfName = scan.nextInt();

		if (lengthOfName > 22) {
			System.out.println("Slack cannot take more than 22 char!");
			lengthOfName = 21;
			System.out.println("User name has been adjusted!");
		}
		// else if(lengthOfName>18){
//			System.out.println("Looks like good length");
//		}
		System.out.println("Succesfully added user!");
	}

}
