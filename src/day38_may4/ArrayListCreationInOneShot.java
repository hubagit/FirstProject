package day38_may4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreationInOneShot {

	public static void main(String[] args) {
		// Arrays.asList(varArg) can be used to add items
		// while object is being created

		// however,
		// 1) the variable type must be a list
		// because the method returns List not ArrayList
		// 2) it will generate an unmodifiable list
		// can not add or remove
		// add or remove operation is forbidden
		// update will work by using set
		
		List<Integer> lst = Arrays.asList(3, 5, 6, 7, 5, 4, 3);
		
//		List<Integer> lst2 = Arrays.asList(1,2,3,4,5,6,7,8);
//		System.out.println(lst2);
//		lst2.set(0, 10);
//		System.out.println(lst2);
		
//		ArrayList<Integer> lst3 = new ArrayList<>(lst2);
//		lst3.add(9);
//		lst3.add(10);
//		System.out.println(lst3);
		
		// lst.add(100);//this not work
		// lst.remove(0);//this not work
		// lst.set(0,100); //this works

		System.out.println(lst);
		
		// Since we can not add or remove item from above list 
	    // we want to copy everything from the list 
	    // into the new list that we can modify 
		
		ArrayList<Integer> myCoolList = new ArrayList<>(lst);
		myCoolList.add(100);
		myCoolList.remove(Integer.valueOf(3));
		System.out.println(myCoolList);

		List<String> JLA = Arrays.asList("Superman", "Batman", "Wonder Woman");
		System.out.println(JLA);

		ArrayList<String> JLPcopy = 
		new ArrayList<>(Arrays.asList("Superman", "Batman", "Wonder Woman"));
//		ArrayList<String> JLPCopy2 =new ArrayList<>(JLA);
//		System.out.println(JLPCopy2);
	
		System.out.println(JLPcopy);
	
		JLPcopy.add("Flash");
		JLPcopy.add("Thanos");
		JLPcopy.remove("Thanos");
		System.out.println(JLPcopy);
		
		
		
		
	
	}

}
