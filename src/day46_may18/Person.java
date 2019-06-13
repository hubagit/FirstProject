package day46_may18;

public class Person {

	

	String name;
	float height;
	char gender;

	 static String race = "Human"; //private ==> access with get-set 
	 static int counter;
	// int counter;

	public Person(String name, float height, char gender) {

		this.name = name;
		this.height = height;
		this.gender = gender;
		// counter = counter +1;
		counter++;
	}

	public Person() {
		counter++;
	}

}
