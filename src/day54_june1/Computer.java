package day54_june1;

public class Computer extends Electronic {

//	 //@Override //this is a new method, it's not overriding,
//	public void turnOn() {
//		System.out.println("computer");
//	}

	@Override
	// overriding method in sub class can be optionally final to block sub class
	// of computer overriding turOff
	
	public final void turnOff() {
		System.out.println("electronic");
	}
}

class Electronic {

//	private void turnOn() {
//		System.out.println("electronic");
//	}

	public void turnOff() {
		System.out.println("electronic");
	}

}