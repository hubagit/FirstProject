package day52_may28;

public class Student extends Person {

	private int student_id;
	public static final String SCHOOL_NAME = "Cybertek";

	public Student(String name, int age, char gender, int student_id) {
		super(name, age, gender);
		this.student_id = student_id;
		System.out.println("Student constructor");
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + ", student_id="
				+ student_id + "]";
	}

}
