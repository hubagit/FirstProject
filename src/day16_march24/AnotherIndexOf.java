package day16_march24;

public class AnotherIndexOf {

	public static void main(String[] args) {
		// 01234567890123456789
		String str = "java is fun. Let's have a break!";
		// give me string from location 6 till location 10

		int space1 = str.indexOf(" ");
		int space2 = str.indexOf(" ", space1 + 1);
		int space3 = str.indexOf(" ", space2 + 1);

		String word = str.substring(space1 + 1, space2);
		System.out.println(word);
		
		String word2 = str.substring(space2+1, space3);
		System.out.println(word2);

		System.out.println(str.indexOf("A"));
		System.out.println(str.indexOf("A", 1));
		System.out.println(str.indexOf("A", 10));
		System.out.println(str.indexOf("A", 11));
		System.out.println(str.indexOf("A", 12));

		// second word is between first and second space
		// third word is between second and third space
		System.out.println(str.indexOf(" "));

	}

}
