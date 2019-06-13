package day18_march27;

public class WhileLoopDoesNotAlwaysGoToblock {

	public static void main(String[] args) {

		int x = 100;
		while (x > 200) {
			System.out.println("do something");
			x++;
		}
		System.out.println("END");
	}

}
