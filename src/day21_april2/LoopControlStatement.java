package day21_april2;

public class LoopControlStatement {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				continue;
			}
			//break; dead code
			System.out.println("GOT SMART WATER? " + i);
			
		}

	}

}
