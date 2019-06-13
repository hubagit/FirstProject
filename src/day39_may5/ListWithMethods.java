package day39_may5;

import java.util.ArrayList;
import java.util.List;

public class ListWithMethods {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		lst.add("apple");
		lst.add("orange");
		lst.add("banana");
		lst.add("kiwi");

		printItems(lst);
		printItems(lst);

		System.out.println(getListFrom(7));
		System.out.println(getListFrom(17));
		System.out.println(getListFrom(3));

		// System.out.println(numList );
		
		System.out.println(myNumsMethod(1));
		System.out.println(myNumsMethod(2));
		System.out.println(myNumsMethod(3));
	
		

	}

	public static void printItems(List<String> strLst) {

		for (int i = 0; i < strLst.size(); i++) {
			System.out.print(strLst.get(i) + "-");
		}

		System.out.println();

	}

	// create a method that accepts a number as ending point
	// and returns List of Integer from 1 to that number
	public static ArrayList<Integer> getListFrom(int x) {
		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 1; i <= x; i++) {
			numList.add(i);
		}
		return numList;

	}
	public static ArrayList<Integer> myNumsMethod(int x){
		ArrayList<Integer> myNumbers = new ArrayList<>();
		
		for (int i = 1; i <= x; i++) {
			myNumbers.add(i*(3*i-1)/2);
		}
		
		return myNumbers;
		
	}

}
