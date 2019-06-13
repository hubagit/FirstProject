package day36_april30;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {

	public static void main(String[] args) {

		int i = 10;
		Scanner scan = new Scanner(System.in);
		Double d = new Double("2.14");
		float f = 1.4f;

		// an ArrayList variable list1 is created
		// and ArrayList object is created and assigned to lst1
		// it did not specify what we can store in this ArrayList
		// so we can store any type

		ArrayList lst1 = new ArrayList();

		lst1.add("abc");
		lst1.add("efg");
		lst1.add(new Integer(10));
		lst1.add(Character.valueOf('A'));
		System.out.println(lst1);

		ArrayList lst3 = new ArrayList();
		lst3.add("apple");
		lst3.add(123);
		lst3.add(new Double(2.3));
		lst3.add(new Character('M'));
		lst3.add(Boolean.valueOf(true));
		System.out.println(lst3);

		ArrayList<Integer> lst4 = new ArrayList<>();
		ArrayList<String> lst2 = new ArrayList<>();

	}

}
