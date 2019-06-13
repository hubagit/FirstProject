package day12_march17;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("how is weather today?");
		String weather = s.next();
               weather = weather.toLowerCase();
		
		switch (weather) {

		case "sunny":
			System.out.println("go swimming");
			break;
		case "windy":
			System.out.println("go go fly a plane");
			break;
		case "rainy":
			System.out.println("stay home");
			break;
		case "snowy":
			System.out.println("go snowboaring");
			break;
		default:
			System.out.println("Are you sure this is a right weather?");
			break;
		}

//		if (weather.equalsIgnoreCase("sunny")) {
//			System.out.println("go swimming");
//		} else if (weather.equalsIgnoreCase("windy")) {
//			System.out.println("go fly a plane");
//		} else if (weather.equalsIgnoreCase("rainy")) {
//			System.out.println("stay at home");
//		} else if (weather.equalsIgnoreCase("snowy")) {
//			System.out.println("go snowboard");
//		} else {
//			System.out.println("Are you sure this is a right weather? ");
//		}

	}

}
