package day41_may8;

public class Teacher2 {
	private String name;
	private int age;
	private long ssn;
	private int batchNumber;
	private String major;

	// provide setters and getters
	// create method print info

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setAge(int i) {
		age = i;
	}

	public int getAge() {
		return age;

	}

	public void setSSN(long l) {
		ssn = l;

	}

	public long getSSN() {

		return ssn;

	}

	public void setBatchNumber(int b) {
		batchNumber = b;

	}

	public int getBatchNumber() {
		return batchNumber;

	}

	public void setMajor(String str) {
		major = str;

	}

	public String getmajor() {
		return major;

	}

	public void printInfo() {
		System.out.println(
				"name: " + name + " SSN number: " + ssn + " batch number: " + batchNumber + " major: " + major);
	}

}
