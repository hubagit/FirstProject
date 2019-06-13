package day38_may4;

import java.util.ArrayList;

public class ArrayListTask2 {

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

		for (int i = 1; i < 101; i++) {
			list.add(i);

		}
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();

		for (int i = 100; i > 0; i--) {
			list2.add(i);

		}
		System.out.println(list2);

		// the logic is : pick each and every item in list2 and
		// add to to list1
//		for (int i = 0; i < list2.size(); i++) {
//			list.add( list2.get(i));
//		}

		for (int i = 0; i < list2.size(); i++) {
			//list.add((list2.get(i)));
			Integer eachIn2 = list2.get(i);
			list.add(eachIn2);
		}
		System.out.println(list);
	}

}
