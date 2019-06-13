package day22_april3;

public class SubstringPractice {

	public static void main(String[] args) {

		String song = "Name : Ba Ba Black Sheep Ba";

		String target = "Ba";

		int indexOf1Ba = song.indexOf("Ba");
		System.out.println(indexOf1Ba);

		// indexOf(string,beginningIndex
		int indexOf2Ba = song.indexOf("Ba", indexOf1Ba + 2);

		System.out.println(indexOf2Ba);

		int indexOf3Ba = song.indexOf("Ba", indexOf2Ba + 2);

		System.out.println(indexOf3Ba);
	}

}
