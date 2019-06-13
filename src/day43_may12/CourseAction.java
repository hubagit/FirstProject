package day43_may12;

public class CourseAction {

	public static void main(String[] args) {

		Course abc = new Course();
		System.out.println(abc.name);
		System.out.println(abc.courseID);

		Course java = new Course();
		System.out.println(java.name);
		Course selenium = new Course();
		Course softSkill = new Course();

		Course sql = new Course("sql");
		System.out.println(sql.name);

//	    String s = new String(); 
//	    String s1 = new String("abc"); 

//	    Integer i = new Integer(123); 
//	    Integer i1 = new Integer("123"); 

		Course javaScript = new Course("java Script", 11);
		System.out.println(javaScript.name);
		System.out.println(javaScript.courseID);

	}

}
