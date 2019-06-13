package day44_may14;

import java.util.Arrays;

public class MathOperationsTest {

	public static void main(String[] args) {

		MathEquasion math1 = new MathEquasion();
		//MathEquasion math2 = new MathEquasion('*');
		MathEquasion math3 = new MathEquasion(10, 5, '+');

		math3.calculate();
		System.out.println(math3.getResult());

		// MathEquasion[] myArr = new MathEquasion[] {math1, math2, math3};
		MathEquasion myARR[] = { math1, math3 };

		System.out.println(Arrays.toString(myARR));

		for (MathEquasion each : myARR) {
			System.out.println(each);
			System.out.println(each.getResult());

		}

	}

}
