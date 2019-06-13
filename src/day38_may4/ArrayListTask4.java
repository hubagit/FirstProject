package day38_may4;

import java.util.ArrayList;

public class ArrayListTask4 {

	public static void main(String[] args) {
		
		ArrayList<String> lst1 = new ArrayList<>();
		lst1.add("Superman");
		lst1.add("Batman");
		lst1.add("Aquaman");
		
		ArrayList<String> lst2 = new ArrayList<>();
		lst2.add("Wonder Woman");
		lst2.add("Cyborg");
		lst2.add("Flash");
		
//		ArrayList<String> lst3 = new ArrayList<>();
//		lst3.add("Ali");
//		lst3.add("Veli");
//		
//		lst1.addAll(lst3);
//		System.out.println(lst1);
		
		//ArrayList<String> lst4 = new ArrayList<>(lst1);
		
//		lst1.addAll(lst2);
//		System.out.println(lst1);
		
		lst1.addAll(2,lst2);
		System.out.println("Justice league : "+lst1);
		
		
		//creating arrayList with all the items from another list
		
		ArrayList<String> lst3 = new ArrayList<>(lst1);
		
		System.out.println("Justice league earth 2 : "+lst3);
		
		// how to get String representation out of arrayList object
		String lstAsString = lst3.toString();
		System.out.println(lstAsString);
		
		//whenever you print out a reference variable
		//that points to an object, it will automatically
		//call toString() method implicitly
		
		
	}

}
