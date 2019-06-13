package day12_march17;

import java.util.Scanner;

public class HwSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String season;

		System.out.println("Enter a number of month:");
		int monthNumber = s.nextInt();

		switch (monthNumber) {
		case 3:
		case 4:
		case 5:
			season = "spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "fall";
			break;
		case 12:
		case 1:
		case 2:
			season = "winter";
			break;
		default:
			season = "Invalid";
			break;
		}
		System.out.println(season);
	}

}
