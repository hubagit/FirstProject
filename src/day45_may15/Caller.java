package day45_may15;

public class Caller {

	public Caller() {
		//this(100); ==> not allowed 
		System.out.println("calling no arg");
	}

	public Caller(int x) {
		this();
		System.out.println("calling 1 arg");
	}

}
