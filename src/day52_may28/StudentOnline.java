package day52_may28;

public class StudentOnline extends Student {

	private boolean isOnline;

	public StudentOnline(String name, int age, char gender, int studenId) {
		super(name, age, gender, studenId);
		System.out.println("Student online constructor");
	}

	//this method will set status of isOnline variable
	//this is an action, like a setter method. it sets status
	public void joinZoom() {
		if (isOnline == false) {
			isOnline = true;
			System.out.println("Joining class online");
		} else {
			System.out.println("Already joined!");
		}
	}
	// will return value of online instance variable
	// it is not an action. it is like a status report
	public boolean getIsOnline() {
		return isOnline;
	}
}
