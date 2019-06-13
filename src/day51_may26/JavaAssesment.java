package day51_may26;

public class JavaAssesment extends Assessment {

//	int questionCount;
//	int score;
//	String type;
	int level;
//	static int timeLimit;

	public static void main(String[] args) {

		// static way to access .timeLimit
		System.out.println(Assessment.timeLimit);
		// accessing inherited static field directly in static method
		System.out.println(timeLimit);
		timeLimit = 50;
		// accessing inherited static field in static way
		// using this class name
		System.out.println(JavaAssesment.timeLimit);

		Assessment.printTimeLimit();
		printTimeLimit();
		JavaAssesment.printTimeLimit();

	}

//	public static void printTimeLimit() {
//		System.out.println("time limit "+timeLimit);
//	}
//	@Override
//	public String toString() {
//		return "Assessment [questionCount=" + questionCount + ", score=" 
//	                      + score + ", type=" + type + "]";
//	}
}
