package day23_april6;

public class NestedLoop {

	public static void main(String[] args) {

//		for (int j = 0; j < 3; j++) {
//
//			for (int i = 1; i < 6; i++) {
//				System.out.print(i + " ");
//			}
//
//			System.out.println();
//		}

		for (int j = 0; j < 4; j++) {
			System.out.println("Iteration "+(j+1));
			for (int i = 15; i > 4; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
