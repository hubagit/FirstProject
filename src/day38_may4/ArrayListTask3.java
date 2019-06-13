package day38_may4;

import java.util.ArrayList;

public class ArrayListTask3 {

	public static void main(String[] args) {
		/*
		 * TASK 1 : Create an ArrayList of integer from 1-100
		 * 
		 * get the sum of the each items get the average
		 * 
		 * Create another list that contain items from 100- 1 get the count of numbers
		 * divisible by 3 and 5
		 * 
		 * 
		 * Combine above 2 lists -- add everything from 2nd list to first one
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list.add(i);

		}
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 6; i > 0; i--) {
			list2.add(i);

		}
		System.out.println(list2);

		// addAll method of ArrayList class
		// this will just add every item list2 by the end of list1 items

//		list.addAll(list2);
//		System.out.println(list);
		
//		list.addAll(list2);

		// addAll method of ArrayList class, second overloaded version
		// this will just insert every item in list2
		// to the specified index

//		list.addAll(1, list2);
//		System.out.println(list);

		list.addAll(0,list2);
		System.out.println(list);
	}

}
