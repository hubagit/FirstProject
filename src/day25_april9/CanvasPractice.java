package day25_april9;

public class CanvasPractice {

	public static void main(String[] args) {

		String[] courses = { "Welcome Kit", "Online-Java Programming", "Online-Software Development Lifecycle",
				"Online-Software QA Testing", "Online-Team Activity", "Online-Mentoring", "Online-Selenium",
				"Online-SQL", "Online-API Testing" };
		int[] courseId = { 143, 166, 168, 170, 163, 203, 169, 171, 164 };

		// use above two array to generate below messages

		// The course id for <Welcome Kit> is <143>
		// ================================================
		for (int i = 0; i < courseId.length; i++) {
			System.out.println("The course id for <" + courses[i] + "> is <" + courseId[i] + ">");
		}
		System.out.println("============================");
		// find out ID of online java Programming course
		// ================================================
		for (int i = 0; i < courseId.length; i++) {
			String eachCourse = courses[i];
			// System.out.println(eachCourse);
			if (eachCourse.equals("Online-Java Programming")) {
				System.out.println("Index is " + courseId[i]);
				break;
			}
		}
		System.out.println("=============================");
		// find out the course name of 203
		// ================================================
		for (int j = 0; j < courseId.length; j++) {
			int eachCoursesId = courseId[j];

			if (eachCoursesId == 203) {
				System.out.println("203 Course name is " + courses[j]);
				break;
			}
		}
		System.out.println("============================");
		// count the courses that contain Software

		int count = 0;
		for (int j = 0; j < courses.length; j++) {

			if (courses[j].contains("Software")) {
				count++;
			}

		}
		System.out.println("Course that contains Software: " + count);
	}

}
