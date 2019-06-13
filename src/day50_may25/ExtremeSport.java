package day50_may25;

public class ExtremeSport extends Sport {

	// what we observed here
	// same method
	// same method parameter list
	// same return type
	// same access modifier
	// this method is in sub class
	// this is an instance method

	// this is the optional annotation to make sure
	// you have overRiden the method correctly
	@Override
	public void doSport() {
		System.out.println("doing extreme sport --- sky diving");
	}

	@Override
	public String toString() {
		return "extreme message";
	}

	public static void main(String[] args) {
		ExtremeSport e1 = new ExtremeSport();
		e1.doSport();
		System.out.println(e1.toString());
	}
}
