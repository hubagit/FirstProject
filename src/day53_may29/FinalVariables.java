package day53_may29;

final public class FinalVariables {

	private final String SEARCH_ENGINE;// this is not static variable. It is an instance variable.
	public final String JUNE = "June";

	final public static int MAX_NUMBER_OFSTUDENTS;
	final public static int MAX_NUMBER_OFTEACHERS = 5;
	private final String CEO;
	
	// The blank final field MAX_NUMBER_OFSTUDENTS
	// may not have been initialized
	// because it is final it must be initialized

	// we need static block to initilialize static variables
	static {
		MAX_NUMBER_OFSTUDENTS = 100; // it's ok to initialize final variables here
		System.out.println("hello from static block");
	}

	// it is ok when init block initializes none-final variables
	{

		System.out.println("hello from init block!");
		SEARCH_ENGINE = "google.com";
	}
	public FinalVariables() {
		CEO = "Mustafa";
	}
	

	public static void main(final String[] args) {

		// final makes variables constant (immutable)
		System.out.println(MAX_NUMBER_OFSTUDENTS);

		FinalVariables obj = new FinalVariables();
		// obj.JUNE = "July"; // so JUNE variable was defined already. Since it is a
		// final variable
		// there is no way o update value
		System.out.println(Math.PI); // PI number is final (constant)
		System.out.println(obj.SEARCH_ENGINE);
		final String ssn = "999-012-000"; // it is not mandatory
		//ssn = "888"; // will not compile
	}
}
