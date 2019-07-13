package day64_july6;

import java.util.*;

public class SubListPractice {

	public static void main(String[] args) {

		List<Double> lst = new ArrayList<>();
		lst.add(2d);
		lst.add(5d);
		lst.add(8d);
		lst.add(13d);
		lst.add(12d);
		lst.add(111d);
		lst.add(7d);

		System.out.println(lst);

		// we can get the view out of the list
		// using sublist which is linked to original list

		List<Double> partOfList = lst.subList(2, 6);
		System.out.println(partOfList);
		
		System.out.println("Part of list first item: " + partOfList.get(0));
		partOfList.set(0, 8.99999999);
		System.out.println("========changed the sub list result========");

		System.out.println(lst);
		System.out.println(partOfList);

		// what if we want to create an independent list with portion of
		// the original items
		
		List<Double> independentLst = new ArrayList<>(partOfList);
		List<Double> independentLst2 = new ArrayList<>(lst.subList(2, 6));

		System.out.println("===========================");
		independentLst.set(0, 9.999999);
		System.out.println(independentLst);
		System.out.println(lst);
		
		// for each method ---> optional !!!!!
		
	
	}

}
