package day52_may28;

public class Employee extends Person {

	private int employee_id;
	private int salary;
	// this is a constant for max salary
	// we should not have employees who have higher salary than MAX_SALARY
	final private int MAX_SALARY = 150000;

	public Employee(String name, int age, char gender, int employee_id, int salary) {
		super(name, age, gender);
		this.employee_id = employee_id;
		setSalary(salary);

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary <= MAX_SALARY) {
			this.salary = salary;
		} else {
			System.out.println("Cannot set salary. Value is too high");
			System.out.println("You don't wanna make no more than CEO");
			System.out.println("I'm serious");
		}
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", salary=" + salary + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + "]";
	}

}
