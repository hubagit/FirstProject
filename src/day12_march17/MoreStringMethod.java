package day12_march17;

public class MoreStringMethod {

	public static void main(String[] args) {

		String weather = "sunny";

		// sTRING METHODS / ACTIONS
		/*
		 * str1.equals(str2)  ----->>>> sensitive
		 * str1.equlasIgnoraCase() --->>>> insensitive
		 * 
		 * str1.toUpperCase() str1.toLowerCase()
		 * str1.toUpperCase() str1.toUpperCase()
		 * 
		 * str1.charAt(position of your charter as int)
		 */

		//System.out.println(weather.toUpperCase());
		//System.out.println(weather.toLowerCase());

		String name = "Mustafa"; //M-0
		
		char firstChar = name.charAt(0);
		System.out.println("first charter is "+ firstChar);
		
		
		String name2 = "Sungur";
		firstChar = name2.charAt(3);
		
		System.out.println("first charter is "+ firstChar);
		
		
		
	}

}
