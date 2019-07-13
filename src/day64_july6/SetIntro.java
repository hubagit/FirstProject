package day64_july6;

import java.util.*;

public class SetIntro {

	public static void main(String[] args) {

		// Set interface
		// defines a data structure of unique element

		// it does not have concept of index
		// it does not maintain insertion order
		// HashSet class

		// HashSet<String> myStates2 = new HashSet<>();

		Set<String> myStates = new HashSet<>();
		myStates.add("VA");
		myStates.add("TX");
		myStates.add("VA"); // this does not do anything
		myStates.add("PA");
		myStates.add("CA");
		myStates.add("VA"); // this does not do anything
		myStates.add("VA"); // this does not do anything
		myStates.add("VA"); // this does not do anything

		System.out.println(myStates);
		System.out.println("size is: " + myStates.size());

		// Removing item: we have only one option
		// Remove by object itself
		myStates.remove("PA");

		// check whether we have an item
		System.out.println("PA exists " + myStates.contains("PA"));
		
		for (String state : myStates) {
			System.out.println("my state is: " + state);
		}

		// what if we want to copy these unique value
		// somewhere else where we can use index

//		List<String> lst = new ArrayList<>(myStates);
//		System.out.println(lst);
//		System.out.println(lst.get(0));

	}

}
