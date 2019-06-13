package day17_march26;

public class MoreStringPool {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = a.concat("efg");
		String c = "abcefg";
		
		System.out.println(b==c);

	}

}
