package day34_april27;

public class Warmup {

	public static void main(String[] args) {
		// write a method to test a String is a palindrome

		// static method called isPalindrome
		// it takes one String as a parameter
		// return boolean
		// for example : ana --> ana ,level
		// race car -->
		// was it a car or a cat i saw
		// space does not matter

		System.out.println(isPalindrome("ana"));
		System.out.println(isPalindrome("cat"));
		System.out.println(isPalindrome("was it a car or a cat i saw"));

		System.out.println(isPalindrome2("ana"));
		System.out.println(isPalindrome2("cat"));
		System.out.println(isPalindrome2("was it a car or a cat i saw"));

		System.out.println(myPalindrome("ana"));
		System.out.println(myPalindrome("dog"));
		System.out.println(myPalindrome("was it a car or a cat i saw"));

		System.out.println(myMethod("anna"));
		System.out.println(myMethod("baba"));
		System.out.println(myMethod("was it a car or a cat i saw"));

		System.out.println(myMethod2("racecar"));
		boolean test = myMethod2("anything");
		System.out.println(test);
		String random = "was it a car or a cat i saw";
		System.out.println(myMethod2(random));
	}

	public static boolean isPalindrome(String name) {

		name = name.replaceAll(" ", "");
		String reversed = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reversed += "" + name.charAt(i);
		}

//		if (name.equals(reversed))
//			return true;
//		else
//			return false;

		return name.equalsIgnoreCase(reversed);

	}

	public static String reversedString(String name) {
		name = name.replaceAll(" ", "");
		String reversed = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reversed += "" + name.charAt(i);
		}

		return reversed;
	}

	public static boolean isPalindrome2(String name) {
		name = name.replaceAll(" ", "");
		String reversed = reversedString(name);

		return name.equals(reversed);
	}

	public static boolean myPalindrome(String word) {
		word = word.replaceAll(" ", "");
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) == word.charAt(word.length() - 1 - i))
				return true;
		}

		return false;
	}

	public static char[] myMethod(String target) {
		target = target.replaceAll(" ", "");
		char[] mychars = target.toCharArray();
		for (int i = 0; i < mychars.length / 2; i++) {

			char temp = mychars[i];
			mychars[i] = mychars[mychars.length - 1 - i];
			mychars[mychars.length - 1 - i] = temp;

		}

		return mychars;
	}

	public static boolean myMethod2(String target) {
		target = target.replace(" ", "");
		String str = new String(myMethod(target));

		return str.equalsIgnoreCase(target);
//		if (str.equalsIgnoreCase(target))
//			return true;

	}

}
