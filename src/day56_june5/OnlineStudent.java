package day56_june5;

// implementing an inheritance also building a parent child relationship
// we use implements keyword rather than extends used by a class
// the class must implement every abstract method

public class OnlineStudent implements Teachable {

	//public static final boolean STUDY_HARD = true; 
	@Override
	public void canLearn() {
		System.out.println("can learn by hardwork");

	}

	@Override
	public void doHomework() {
		System.out.println("will do all hardwork");

	}

	public static void main(String[] args) {
		System.out.println(Teachable.STUDY_HARD);
		System.out.println(STUDY_HARD);

		OnlineStudent o = new OnlineStudent();
		o.canLearn();
		o.doHomework();
		//Teachable t = new Teachable(); //cannot compile, no creating object

	}

}
