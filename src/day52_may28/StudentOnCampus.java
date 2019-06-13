package day52_may28;

public class StudentOnCampus extends Student {

	private boolean isOnCampus;

	public StudentOnCampus(String name, int age, char gender, int studenId) {
		super(name, age, gender, studenId);
		System.out.println("Student on Campus");

	}

	public void goToCampus() {
		// before changing status, we will check it first
		if (isOnCampus == false) {
			isOnCampus = true;
			System.out.println("Coming to campus..");
		} else {
			System.out.println("No need to go any where, already here!");
		}
	}

	// we need this, in order to access isOnCampus
	// instance variable outside
	public boolean getIsOnCampus() {
		return isOnCampus;
	}
}
