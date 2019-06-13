package day15_march23;

public class CharacterToNumber {

	public static void main(String[] args) {
		
//		char c1 = 'A';
//		int cNum = c1;
//		
//		System.out.println(cNum);
		
		
		String name = "Mustafa";
		char firstChar = name.charAt(0);
		char lastChar = name.charAt(name.length()-1);
		
		int a = firstChar;
		int b = lastChar;
		
		System.out.println(a);
		System.out.println(b);
		
		char character0 = '0';
		int zeroAsciiNumber = character0;
		
		System.out.println(zeroAsciiNumber);
		
		char characterA = 'A';
		System.out.println((int)characterA );
		
		System.out.println("sum of ascii code is: "+ (firstChar + lastChar));
		
		
		
		
		

	}

}
