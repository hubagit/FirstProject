package day38_may4;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityClass {

	public static void main(String[] args) {

		// Arrays class is a class that has a lot of
		// static methods to perform common array operations
		// Arrays.sort(arrayObject);

		// Collections is a class under java.util package
		// to perform common collection object related operation

		ArrayList<String> lst = new ArrayList<>();
		lst.add("Etka");
		lst.add("Umut");
		lst.add("Aygul");
		lst.add("Izdar");
		lst.add("Amir");
		lst.add("Mehmet");

		System.out.println(lst);
		
		
		
//		ArrayList<String> myList = new ArrayList<>();
//		myList.add("Mustafa");
//		myList.add("Zuha");
//		myList.add("Zehra");
//		
//		System.out.println(myList);
//		
//		Collections.sort(myList);
//		System.out.println(myList);
//		
//		int indexOfZehra = Collections.binarySearch(myList, "Zehra");
//		System.out.println(indexOfZehra);
//		
//		Collections.reverse(myList);
//		System.out.println(myList);
//		
//		Collections.shuffle(myList);
//		System.out.println(myList);
		
		
		
		// sorting arrayList using sort method of Collections class
		Collections.sort(lst);
		System.out.println(lst);

		int amirLocation = Collections.binarySearch(lst, "Amir");
		System.out.println("index is: " + amirLocation);

		// looking for the index of an item in the sorted list
		int talmuratLocation = Collections.binarySearch(lst, "talmurat");
		System.out.println("index is: " + talmuratLocation);

		Collections.reverse(lst);
		System.out.println(lst);
		
		//shuffle items inside the list
		Collections.shuffle(lst);
		System.out.println(lst);

		// sort method from ArrayList accepts an object called Comparator
		// we did not learn. However even though we don't know this type of object
		// we do know that any reference variable can be set to null
		// so we can just pass null to this method
		// and it will just work
	// lst.sort(null); 

	}

}
