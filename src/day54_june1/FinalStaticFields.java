package day54_june1;

public class FinalStaticFields {

	// public static final field ==> constant

	// final static field must be initialized before class finish loading
	public static final String RACE = "Human";

	static final int MAX_NUM=getStaticNum();

	private static final int MAX_SPEED;
	// ALL CAP is highly recommended
	// static final String lowercase = "lower";

	static {
		MAX_SPEED = 120;
	}

	public static int getStaticNum() {
		return 200;
	}

	public static void main(String[] args) {

		System.out.println(RACE);
		System.out.println(MAX_SPEED);

		// RACE = "Humanoid";
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);

	}

}
