package day55_june2;

public class SalariedEmployee extends Employee {

	private int monthlySalary;

	public SalariedEmployee(int id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}

	public static void main(String[] args) {

		SalariedEmployee e1 = new SalariedEmployee(101, "Bilal", 10000);
		System.out.println(e1.toString());
		e1.calculateAnnualSalary();

		int newMonthlySalary = (int) (e1.getMonthlySalary() * 1.1);
		e1.setMonthlySalary(newMonthlySalary);
		e1.calculateAnnualSalary();

		HourlyEmployee e2 = new HourlyEmployee(102, "Ahmat", 160, 80);
		System.out.println(e2.toString());
		e2.calculateAnnualSalary();

	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public void calculateAnnualSalary() {

		System.out.println(monthlySalary * 12);

	}

	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + ", id=" + getId() + ", name=" + getName() + "]";
	}

	@Override
	public boolean isIn100KClub() {

		return false;
	}

}
