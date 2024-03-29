package day42_may11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import day24_april7.RandomNumbers;

public class WarmupArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(6); // --> list1.add( new Integer(6)) ;
		list1.add(12);
		list1.add(65);
		list1.add(9);
		list1.add(73);

		// updating first item to double of original value
		// getting first item
		Integer item1 = list1.get(0);
		Integer updated1stItem = item1 * 2;
		// updating first item with doubled value
		list1.set(0, updated1stItem);

		System.out.println(list1);

		// doing above in one shot
//	    list1.set(0,  list1.get(0) * 2 ) ; 
//	    list1.set(1,  list1.get(1) * 2 ) ; 
//	    list1.set(2,  list1.get(2) * 2 ) ; 
		for (int i = 0; i < list1.size(); i++) {

			list1.set(i, list1.get(i) * 2);

		}

		System.out.println(list1);

		// Arrays.asList return a fixed size list and return type is List
		// so it has to be stored in List variable

		List<Integer> nums2 = Arrays.asList(10, 2, 33, 24, 15);

		// creating an ArrayList object with another list object
		ArrayList<Integer> list3 = new ArrayList<Integer>(nums2);

		// creating an ArrayList object with another list object in one shot
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10, 2, 33, 24, 15));

		Collections.reverse(list4);

		/*
		 * Day 42
		 * 
		 * Task 1 Create an ArrayList object and add 5 whole numbers
		 * 
		 * try out adding one by one and also try adding in one shot
		 * 
		 * update each number to double of that number 1,3,5,6,7 --> 2 6 10 12 14
		 * 
		 * // reverse this ArrayList using one of the utility method that we learned
		 * from Collections class
		 * 
		 * OPTIONALLY Reverse this ArrayList not using above method
		 * 
		 * OPTIONALLY use random class to randomly assign value to your arraylist object
		 */

		System.out.println("======Practice========");

		ArrayList<Integer> numList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		// List<Integer> numList2 = Arrays.asList(1,2,3,4,5);
		// ArrayList<Integer> mylist = new ArrayList<>(numList2);
		System.out.println(numList1);

		for (int i = 0; i < numList1.size(); i++) {
			numList1.set(i, numList1.get(i) * 2);
		}
		System.out.println(numList1);

		// Collections.reverse(numList1);
		// System.out.println(numList1);

//		for (int i = 0; i < numList1.size()/2; i++) {
//			int temp = numList1.get(i);
//			numList1.set(i,numList1.get(numList1.size()-1-i));
//			numList1.set(numList1.size()-1-i, temp);
//		}
//		
//		System.out.println(numList1);

		// 2nd method to reverse!!!
		ArrayList<Integer> lst = new ArrayList<>();

		for (int i = numList1.size() - 1; i >= 0; i--) {
			lst.add(numList1.get(i));
		}
		System.out.println(lst);
		
		ArrayList<Integer> newList = new ArrayList<>();
		Random random = new Random();
		newList.add(random.nextInt(10));
		System.out.println(newList);

	}

}
