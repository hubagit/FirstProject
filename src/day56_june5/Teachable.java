package day56_june5;

//interface is an abstract type
//just like abstract classes
public interface Teachable {

	// as of java 7
	// interface can only have CONSTANT and abstract methods

	public static final boolean STUDY_HARD = true;
	// any field you have is automatically public static final
	String SCHOOL = "Cybertek"; // ==> public static final...

	// any method without body or access modifier
	// it's automatically public and abstract

	// very common interview | exam question goes as :
	// not providing access modifier in interface
	// and overriding the method with default access modifier
	// DOES NOT COMPILE !!!
	void canLearn(); // ==> public abstract...

	public abstract void doHomework();
}
