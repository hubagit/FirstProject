package day48_may21;

public class Student {

	private String name;
	private int age;
	private float height;
	private char gender;
	private int studentId;

	static int counter;

	public Student(String name, int age, float height, char gender, int studentId) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.studentId = studentId;
		counter++;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", studentId="
				+ studentId + "]";
	}
}
