package day50_difPackage;

import day50_may25.Vehicle;

public class Airplane extends Vehicle {

	// protected int year;
	private int wingCount;

//	 public Airplane() {
//	    super(); 
//	 }

	public static void main(String[] args) {

		Airplane a1 = new Airplane("Boeing", "737", 2020, 4);
		System.out.println(a1.toString());
		System.out.println(a1.year);
		System.out.println("==================");
		Vehicle v1 = new Vehicle("F35", "730", 2021);
		System.out.println(v1.toString());

	}

	public Airplane(String brand, String model, int year, int wingCount) {
		// we already have functionality to set these 3 fields value
		// so we are just using super class constructor to set these value
		super(brand, model, year);
		// could we have done it without above call ;
//	    setBrand(brand);
//	    this.setModel(model);  
//	    this.year = year ; 
		this.wingCount = wingCount;
	}

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}

	// @Override
	public String toString() {
		return "Airplane [wingCount=" + wingCount + ", year=" + year + ", brand=" + getBrand() + ", model=" + getModel()
				+ "]";
	}

	/*
	 * public String getBrand() { return brand; } public void setBrand(String brand)
	 * { this.brand = brand; } public String getModel() { return model; }
	 * 
	 * public void setModel(String model) { this.model = model; }
	 * 
	 */
}
