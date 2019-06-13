package day11_march16;

public class SijngleStatement {

	public static void main(String[] args) {

		int x = 100;

//		if (x != 100) {
//			System.out.println("Not a 100");
//		} else {
//			System.out.println("yes 100");
//		}
//		if (x > 100)
//			System.out.println("more than 100");
//		System.out.println("something else");
//
//		if (x > 100 && ++x < 200) {
//			System.out.println("both are true");
//		}
//		if (x > 100 & ++x < 200) {
//			System.out.println("both are true");
//		}
//		if (x == 100 || ++x < 200) {
//			System.out.println("both are true");
//
//		}
		if (x > 100 | ++x < 200) {
			System.out.println("both are true");

		}
		System.out.println(x);

	}

}
