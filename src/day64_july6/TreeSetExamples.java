package day64_july6;

import java.util.*;

public class TreeSetExamples {

	public static void main(String[] args) {

		// SortedSet interface extends Set interface
		// TreeSet implements SortedSet

		Set<Integer> myTreeSet3 = new TreeSet<>();
		TreeSet<Integer> myTreeSet2 = new TreeSet<>();
		// HashSet<Integer> myTreeSet = new TreeSet<>(); //BAD!!!

		TreeSet<Integer> myTreeSet = new TreeSet<>();
		myTreeSet.add(23);
		myTreeSet.add(23);
		myTreeSet.add(23);
		myTreeSet.add(3);
		myTreeSet.add(3);
		myTreeSet.add(3);
		myTreeSet.add(13);
		myTreeSet.add(20);
		myTreeSet.add(-230);

		System.out.println(myTreeSet);
		System.out.println("Size: " + myTreeSet.size());

		// Getting lowest element
		System.out.println("Lowest element: " + myTreeSet.first());

		// Getting Highest element
		System.out.println("Highest element: " + myTreeSet.last());

		// Getting the view out of the set -- subset middle view
		SortedSet<Integer> myView = myTreeSet.subSet(3, 21);
		System.out.println("myTreeSet.subSet(3,21): " + myView);

		// Getting the view out of the set -- headSet, from beginning
		// till a value
		SortedSet<Integer> myView2 = myTreeSet.headSet(13);
		System.out.println("myTreeSet.headSet(13): " + myView2);
		System.out.println("myTreeSet.headSet(13,true): " + myTreeSet.headSet(13, true)); // true will include 13

		// Getting the view out of the set -- tailSet from middle till the end
		SortedSet<Integer> myView3 = myTreeSet.tailSet(13);

		System.out.println("myTreeSet.tailSet(13): " + myView3);
	}

}
