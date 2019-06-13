package day37_may1;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class ArrayListPractice3 {

	public static void main(String[] args) {

		ArrayList<Double> priceList = new ArrayList<>();
		priceList.add(2.3);
		priceList.add(45.6);
		priceList.add(23.35);
		priceList.add(67.9);
		priceList.add(1.2);

		System.out.println(priceList.get(2));
		int count = priceList.size();
		for (Double eachPrice : priceList) {
			System.out.println("Each item in the Array List " + eachPrice);

		}

		for (int i = 0; i < count; i++) {
			if (priceList.get(i) > 10)
				System.out.println(priceList.get(i));
		}

		// in another loop
		// get the sum of all prices
		System.out.println("Print sum ");
		// arithmatic operation only happens for primitives
		// if you try to add wrapper objects it will be unboxed
		double sum = 0;

		for (double each : priceList) {
			sum += each;

		}
		System.out.println(sum);
	}

}
