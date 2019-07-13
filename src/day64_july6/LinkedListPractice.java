package day64_july6;

import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {

		// List has two popular implementations
		// ArrayList, LinkedList
		List<Integer> lst1 = new ArrayList<>();
		//lst1 = new LinkedList<>();
		List<Integer> lst2 = new LinkedList<>();
		lst2.add(2); // new Integer(2);
		lst2.add(5);
		lst2.add(8);
		lst2.add(1);

		for (int i = 0; i < lst2.size(); i++) {
			System.out.println(lst2.get(i) + " - ");
		}
		System.out.println(lst2.toString());
		lst2.remove(2);
		System.out.println(lst2);
		lst2.remove(new Integer(5));
		System.out.println(lst2);

		List<Long> lst3 = new LinkedList<>();
		lst3.add(1L);
		lst3.add(50L);
		lst3.add(80L);
		lst3.add(10L);
		System.out.println(lst3);
		// can we pass long to a method
		// that accepts int ==> NO!!!
		lst3.remove(1L); // ==> new Long(1L);
		System.out.println(lst3);

		/*
		 * ArrayList is backed by array Whenever we try to add or remove item it's
		 * automatically resizing underlying array for us, so we can just call the
		 * method
		 * 
		 */

		// Adding items
		// linkedList is faster
		// because it just needs to create new pointer to the neighbor
		// Arraylist relatively is slower because of
		// resizing operation in underlying array

		// Removing items
		// linkedList is faster
		// because it just needs to create new pointer to the neighbor
		// Arraylist relatively is slower because of
		// resizing operation in underlying array

		// According to above situation
		// if you have situation that you have to always add or remove
		// items intensively, LinkedList is better

		// get(4); //random access by index

		// Arraylist is faster because it can directly
		// jump to the element since it's backed by array

		// LinkedList is slower because it has to go through
		// each and every neighbor before the element

		/*
		 * if you have situation that you have to always randomly
		 * access items by its index, ArrayList is faster
		 */
	}

}
