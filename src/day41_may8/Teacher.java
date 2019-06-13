package day41_may8;

public class Teacher {

	private String name;
	  private String specialty;
	  // getters and setters

	  // getter method is just like any other method
	  // it's specifically for getting the fields value
	  // and returning it from the method
	  // it accepts no parameter

	  public String getName() {
	    /*
	     * Enroll Cybertek
	     * Go to Spartan
	     * 
	     */
		  return name;
	  }

	  // setter method is just like any other method
	  // it's specifically for setting/upading the field value
	  // it accepts one parameter so we can pass the new value
	  // and return nothing
	  public void setName(String newName) {
	    /*
	     * Go to DMV
	     * get permission
	     * and eventually change the name
	     */
		  name = newName;
	  }

	  // getter method is just like any other method
	  // it's specifically for getting the fields value
	  // and returning it from the method
	  // it accepts no parameter

	  public String getSpecialty() {
	    return specialty;
	  }

	  // setter method is just like any other method
	  // it's specifically for setting/updating the field value
	  // it accepts one parameter so we can pass the new value
	  // and return nothing
	  public void setSpecialty(String newSpecialty) {
	    specialty = newSpecialty;
	  }

}
