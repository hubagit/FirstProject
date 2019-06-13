package day45_may15;

public class Iftar {

	String food;
	String time;
	String beverage;

	// what can we do inside constructor
	// access the fields , set the field value
	// reuse other constructor functionality
	// call methods

	public Iftar(String food, String time, String beverage) {

//	    this.food = food;
//	    this.time = time;
//	    this.beverage = beverage;
		setFood(food);
		setTime(time);
		setBeverage(beverage);

	}

	public String toString() {
		return "Iftar [food=" + food + ", time=" + time + ", beverage=" + beverage + "]";
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getBeverage() {
		return beverage;
	}

	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	
	public Iftar(String food, String time) {
		//this.food = food;
		//this.time = time;
		
		setFood(food);
		setTime(time);
		
		
		
		
		
	}

}
