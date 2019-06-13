package day13_march19;

public class MoreStringPractice {

	public static void main(String[] args) {
		
		String s1  = "Sungur";
		
		boolean uExistOrNot = s1.contains("u");
		int indexOfName = s1.indexOf("u");
		
		System.out.println("Does name contain u? "+ s1.contains("u"));
		System.out.println("What is the position of u? " + s1.indexOf("u"));
		
		System.out.println("Does name contain u? "+ uExistOrNot );
		System.out.println("What is the position of u? " + indexOfName);
		
		System.out.println(s1.lastIndexOf("u"));
		
		// s1.contains("something")  ---> check for part of string inside another string
	    // s1.indexOf("s")  ---> this will give you position of certain part of the string
	    
		// -------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	   
		// subString(beginning index , ending index )
	    // it will return part of a string staring from beginning till right before ending index
	    
	    String partOfString = s1.substring(3,6);
	    System.out.println(partOfString);
	    
	}

}
