package day30_april17;

public class StringUtility {

	public static void main(String[] args) {
		reverseString("abc");
		reverseString("Orville");
		reverseString("java");
		reverseString("WestWorld");
		
		randomMethod(12, 13, 35);
	}

	public static void reverseString(String str) {
		
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	public static void randomMethod(int a, int b, int c) {
		int sum = a+b+c;
		int average =sum/3;
		
		System.out.println("The average of the numbers "+a+", "+b+", "+c+" is "+average);
		
		
		
	}
	
	
	
}
