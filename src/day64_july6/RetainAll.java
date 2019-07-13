package day64_july6;

import java.util.*;

public class RetainAll {

	public static void main(String[] args) {

		List<Integer> mylst = Arrays.asList(3, 3, 3, 4, 7, 5, 33, 55);

		// any type of collection has a constructor to take
		// another collection object so it can copy everything inside
		Set<Integer> mySet = new HashSet<>(mylst);
		System.out.println(mylst);
		System.out.println(mySet);

		Set<Integer> mySet2 = new HashSet<>(Arrays.asList(3, 3, 3, 3, 3, 3, 34, 34));
		System.out.println(mySet2.size());
		System.out.println(mySet2);

		// remove all will cut the items that exist in both collection
//		mySet.removeAll(mySet2);
//		System.out.println(mySet);

		// retainAll
		mySet.retainAll(mySet2);
		System.out.println(mySet);
	
	
	
	}

}
