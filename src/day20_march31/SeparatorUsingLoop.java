package day20_march31;

public class SeparatorUsingLoop {

	public static void main(String[] args) {

		String mix = "Aonline132x";
		String numberStr = "";
		String letterStr = "";

//		int i = 0;
//		while (i < mix.length()) {
//
//			char c = mix.charAt(i);
//			if (c >= '0' && c <= '9') {
//				System.out.println(c);
//				numberStr +=c;
//			}
//			i++;
//
//		}
//	System.out.println(numberStr);

		int i = 0;
		while (i < mix.length()) {

			char cLetters = mix.charAt(i);
			if (cLetters >= 'a' && cLetters <= 'z') {
				//System.out.println(cLetters);
				letterStr +=cLetters;
			}
			i++;

		}
		System.out.println(letterStr);
	}

}
