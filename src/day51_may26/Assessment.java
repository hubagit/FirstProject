package day51_may26;

public class Assessment {

	int questionCount;
	int score;
	String type;

	// in our application all assessment has one shared timeLimit
	static int timeLimit = 45;

	// static method can only access static members
	public static void printTimeLimit() {
		System.out.println("time limit " + timeLimit);
	}

	@Override
	public String toString() {
		return "Assessment [questionCount=" + questionCount + ", score=" + score + ", type=" + type + "]";
	}

}
