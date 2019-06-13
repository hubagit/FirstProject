package day15_march23;

public class MoreStringClassMethods {

	public static void main(String[] args) {
		
//		String word = "apple";
//		
//		word.toUpperCase(); //APPLE
//		System.out.println(word.toUpperCase());
//		System.out.println(word);
		
		//---------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		String name = "Sungur";
		
		System.out.println(name.indexOf("u"));
		System.out.println(name.indexOf("u",2));
		System.out.println(name.indexOf("ur"));
		System.out.println(name.indexOf("u",5));
		System.out.println(name.lastIndexOf("u"));
		
		String str = "";
		System.out.println(str.isEmpty());
		System.out.println(name.startsWith("Su"));
		System.out.println(name.startsWith("k"));
		System.out.println(name.endsWith("gur"));
		System.out.println(name.endsWith("ka"));
		
//		String name2 = " Sungur ";
//		System.out.println(name2.trim());
		
		String firstName = "Mustafa";
		String lastName = " Sungur";
		
		System.out.println(firstName.concat(lastName + " is learning Java"));
		
		System.out.println(name.replace("u", "a"));
		System.out.println(name.replace("g", "c"));
		System.out.println(name.replace("a", "k"));
		
		System.out.println(name.replace("gur", "ny"));
		System.out.println(name.replace("u", "an"));
		System.out.println(name.replace("m", "z"));

	}

}
