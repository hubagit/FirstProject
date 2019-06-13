package day38_may4;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();
		myList.add("Zuccini");
		myList.add("cucumber");
		myList.add("cabbage");
		myList.add("watermelon");
		myList.add("BlueBerry");
		myList.add("Apple");
		myList.add("Bananas");
		myList.add("Milk");
		myList.add("Tea");
		System.out.println(myList);

		// count
		System.out.println("how many items: " + myList.size());
		int count = myList.size();
		System.out.println(count);

		// getting single item
		System.out.println("getting single item by index: " + myList.get(1));
		String str = myList.get(2);
		System.out.println(str);

		// update an item
		myList.set(0, "Tomato");
		System.out.println(myList);
		myList.set(1, "something");
		System.out.println(myList);

		// insert an item
		myList.add(1, "roseberry");
		System.out.println(myList);
		myList.add(0, "apple");
		System.out.println(myList);

		// check an item exists in the list ==> case sensitive!!!
		boolean haveMilkOrNot = myList.contains("Milk");
		System.out.println("Got Milk? " + haveMilkOrNot);

		System.out.println("Got Milk lowercase? " + myList.contains("milk"));

		// check the location of certain item
		int indexOfCabbage = myList.indexOf("cabbage");
		System.out.println("Index of cabbage is " + indexOfCabbage);
		int indexOfTea = myList.indexOf("Tea");
		System.out.println(indexOfTea);

		// remove items using remove

		myList.remove(4);
		System.out.println(myList);
		myList.remove("BlueBerry");
		System.out.println(myList);
		myList.remove(8);
		System.out.println(myList);
		myList.remove("something");
		System.out.println(myList);

		// when using remove(object) version of the method
		// if we don't have the item it remains the same
		myList.remove("Kiwi");
		System.out.println(myList);

		// index has to be within range or it will throw exception
		// myList.remove(100);
		// System.out.println(myList);

		// deleting all from the list
//		myList.clear();
//		System.out.println(myList);
//		myList.clear();
//		System.out.println(myList);

		// checking the list is empty or not
		System.out.println("Checking the list is empty or not: " + myList.isEmpty());

		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + "-");
		}
		System.out.println();

		for (String each : myList) {
			System.out.print(" | Item: " + each);
		}
		System.out.println();
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

		for(String vegetables:myList) {
			System.out.print(vegetables+"|");
		}
	}

}
