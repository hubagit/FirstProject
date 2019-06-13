package day37_may1;

import java.util.ArrayList;

public class MoreArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numlst = new ArrayList<>();
		ArrayList<Double> numlst2 = new ArrayList<>();
		
		numlst2.add(2.3);
		numlst2.add(2.1);
		numlst2.add(2.4);
		System.out.println(numlst2);
		numlst2.add(1,5.0);
		System.out.println(numlst2);
		
		numlst.add(100);
		numlst.add(200);
		numlst.add(300);
		numlst.add(400);

		System.out.println(numlst);

		// inserting items at certain location
		// insert 500 as a second item
		// add (index, value)

		numlst.add(1, 500);
		System.out.println(numlst);

		// System.out.println(numlst.get(7)); wrong!!!

		// it should be within range or exception occur
		// numlst.add(10,500);

		// updating a value inside ArrayList item
		// set(index, newvalue)

		numlst.set(2, 1000);
		System.out.println(numlst);
		
		numlst2.set(2, 7.0);
		System.out.println(numlst2);

		

		// deleting everything from the list
		// numlst.clear();
		// System.out.println(numlst);

		//checking whether an item exists in the list
		//contains(item) ==> return boolean
		
		System.out.println(numlst.contains(1000));
		System.out.println(numlst.contains(3000));
		
		System.out.println(numlst2.contains(7.0));
		System.out.println(numlst2.contains(1.0));
		
		//finding out location of item
		
		int indexOf1000 = numlst.indexOf(1000);
		System.out.println("Index of 1000 is "+indexOf1000);
		
		boolean isItEmptyOrNot = numlst.isEmpty();
		System.out.println("is it empty or not "+isItEmptyOrNot);
		
		//counting items
		System.out.println("size of list "+numlst.size());
		
		// removing items from arrayList
				// remove(itemValue);
				// remove(index);
				// This will wait
		
		numlst.remove(1);
		System.out.println(numlst);
		
		numlst2.remove(3);
		System.out.println(numlst2);
		
		numlst2.remove(new Double(2.3));
		System.out.println(numlst2);
		
		numlst2.remove(Double.valueOf(5.0));
		System.out.println(numlst2);
		
		//numlst.remove("300"); this is calling remove index
		//and we dont have index 300
		
		//numlst.remove(new Integer(300));
		numlst.remove(Integer.valueOf(300));
		System.out.println(numlst);
		
		
		
		
	}

}
