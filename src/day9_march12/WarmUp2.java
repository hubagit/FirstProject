package day9_march12;

public class WarmUp2 {

	public static void main(String[] args) {

		int i = 10, j = 20;
		int sum = i + j;

		if ((i > 5) && (j % 2 == 1) && (sum == 30)) {
			System.out.println("That's right!");

		} else {
			System.out.println("Sorry, that's incorrect!");
		}

		if ((i > 5) || (j % 2 == 1) || (sum == 30)) {
			System.out.println("That's right!");

		} else {
			System.out.println("Sorry, that's incorrect!");
		}

	}

}
