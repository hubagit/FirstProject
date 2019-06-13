package day12_march17;

import java.util.Scanner;

public class DayPrinter2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int dayNum;
		String dayWord;

		System.out.println("Enter Day Numbers: ");
		dayNum = s.nextInt();

		switch (dayNum) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayWord = "Weekdays";
			break;
		case 6:
		case 7:
			dayWord = "Weekends";
			break;
		default:
			dayWord = "Invalid Day!";
			break;
		}

		System.out.println(dayWord);

	}

}
