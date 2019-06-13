package day33_april24;

public class GraderApp {

	public static void main(String[] args) {
		
		System.out.println(gradetheScore(99));
		System.out.println(gradetheScore(89));
		System.out.println(gradetheScore(79));
		System.out.println(gradetheScore(69));
		System.out.println(gradetheScore(10));
		System.out.println(gradetheScore(101));

	}

	public static char gradetheScore(int score) {
		
		if(score<=100 && score>= 90)
			return 'A';
		if(score<90 && score>= 80)
			return 'B';
		if(score<80 && score>= 70)
			return 'C';
		
			return 'F';
		
		
	}
}
