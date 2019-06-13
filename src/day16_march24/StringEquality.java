package day16_march24;

public class StringEquality {

	public static void main(String[] args) {
		
		String s1 = "abc";// using string literal
		
		String s2 = new String("abc"); // using new keyword
		System.out.println(s1==s2);
		String s3=s1;
		
	
		System.out.println(s1==s3);
		
	

	}

}
