package day14_march20;

public class StringMethodsClasswork {

	public static void main(String[] args) {

		// store your name into A String 
		// print your last character 
		// print your first 2 character 
		
		// OPTIONAL 
		// print your name starting from middle till the end
		
		String name = "Mustafa";
		int count = name.length();
		
//		System.out.println(name.charAt(6));
//		System.out.println(name.substring(0,2));
//		System.out.println(name.substring(3,7));
//		
		System.out.println(name.charAt(count-1));
		System.out.println(name.substring(0,2));
		
		int midPoint = count/2;
		System.out.println(midPoint);
		System.out.println(name.substring(midPoint,count));
	}

}






