package day22_april3;

import java.util.Scanner;

public class WarmupRepl96 {

	public static void main(String[] args) {

		// Zombie attach repl 96

		// warp up now
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt();
		int numberOfdays = 0;

		while (inhabitants > 0) {
			System.out.println("Day " + numberOfdays + " [" + inhabitants + "]");
			numberOfdays++;
			inhabitants /= 2;

		}

		if (inhabitants == 0)
			System.out.println("---- EXTINCT ----");

	}

}
