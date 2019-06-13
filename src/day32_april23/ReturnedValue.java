package day32_april23;

public class ReturnedValue {

	public static void main(String[] args) {

		char clast = giveMeLastchar("Mustafa Sungur");
		System.out.println();
		System.out.println(clast + "" + clast);

		System.out.println(areYouOk("yes"));
		boolean answer = areYouOk("no");
		System.out.println(answer);
	}

	public static char giveMeLastchar(String name) {
		char last = name.charAt(name.length() - 1);
		System.out.println(last);
		return last;

	}

	public static boolean areYouOk(String question) {

		boolean answer = (question.equalsIgnoreCase("yes")) ? true : false; // ternary operation
		return answer;

	}

}
