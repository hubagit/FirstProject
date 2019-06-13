package day4;

public class JobOffer2 {
	
	public static void main(String[] args) {
		
		System.out.println("Java Virtual Machine");
		
		/*
		 JRE --> to run Java apps
		 JDK --> develop Java apps
		 JDK has JRE, JRE has JVM
		 */
		
		// DECLARING A VARIABLE : dataType varibaleName;
		
		int count ; // declaring variable
		count = 10; // literal value
		
		int score = 100; // declaring and assigning in one statement
		
		int x, y, z;
		
		x = 10;
	    y = 20;
		z = x + y;
		
		// you cannot reuse variable name
		score = 200; // reassignment
		
		System.out.println(z);
		System.out.println("Value of new sore" + " " + score + " " + "dur.");
		
		/*
		 * Naming a variable:
		 * is this a valid name for a variable?
		 * int abc; good
		 * int 123; bad
		 * int a123; good
		 * int _a; good
		 * int $;  good but not recommended
		 * int a-b; bad
		 * int _123; good but not recommended
		 * 
		 * Rules:
		 *     57 reserved keywords should be avoided: System, public, class
		 *     you can use letters a-z and A-Z
		 *     numbers (don't start with a number)
		 *     only 2 special character _ and $
		 *     
		 * Guideline:
		 *     for more than one word, use a camel case like int gameScore;
		 *     make your variable name tell what you wanna store
		 *     int countOfonlineStudent = 300
		 *
		 *Class/Package Names:
		 *
		 * 
		 */
		
		
		
		
		
		
	}

}
