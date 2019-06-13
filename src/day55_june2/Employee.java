package day55_june2;

//CAN WE MAKE ABSTRACT CLASS FINAL 
		// NO 
public abstract class Employee {

	private int id;
	private String name;

	public Employee() {
		
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract void calculateAnnualSalary();
	// can we make static method abstract 
	// no because it can not be overridden 
	
	// can we make final method abstract 
	// NO
	
	// can we make private method abstract 
		// NO 
	
	public abstract boolean isIn100KClub(); 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
//	 {
//		 System.out.println("CALCULATE YOURSELF MY CHILD");
//	 }
}
