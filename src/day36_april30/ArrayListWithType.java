package day36_april30;

import java.util.ArrayList;

public class ArrayListWithType {

	public static void main(String[] args) {

		// NO PRIMITIVE TYPE ALLOWED AS A TYPE
		// ArrayList<int> numList; ==> THIS IS A BAD Code!!!

		// arrayList that stores only Integer
		ArrayList<Integer> numList = new ArrayList<>();
		// numList.add("ABC"); ==> wrong!!!

		Integer i = 100; // autoboxing to Integer Object

		// adding item
		// we call add method from ArrayList class
		numList.add(i);
		numList.add(200);
		numList.add(300);

		// getting single item from ArrayList
		// we call get (index) method of ArrayList
		Integer i1 = numList.get(0);
		int i2 = numList.get(1); // auto unboxing happens here

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(numList.get(2));

		// we can directly print to see what is inside ArrayList
		System.out.println(numList);

		ArrayList<String> str = new ArrayList<>();
		str.add("apples");
		str.add("pears");
		String name1 = str.get(0);
		String name2 = str.get(1);
		String name3 = "bananas";
		str.add(name3);

		System.out.println("First name of fruite is " + name1 + " second name of fruite is " + name2);
		System.out.println((str.get(2)));
		System.out.println(str);

	}

}
