package day12_march17;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {

		String weather = "sunny";
		String action;

		System.out.println("How is the weather?");
		Scanner input = new Scanner(System.in);

		weather = input.next();

		action = (weather.equalsIgnoreCase("sunny")) ? "Go out"
				: (weather.equalsIgnoreCase("windy")) ? "Put on your jacket"
						: (weather.equalsIgnoreCase("rainy")) ? "Take an umbrella"
								: (weather.equalsIgnoreCase("cloudy")) ? "Take you jacket" : "stay home";
		System.out.println(action);
	}

}
