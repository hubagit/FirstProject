package day41_may8;

import java.util.ArrayList;

public class TeacherActions {

	public static void main(String[] args) {

		ArrayList<Teacher2> teacherList = new ArrayList<>();

		Teacher2 t1 = new Teacher2();

		teacherList.add(t1);
		teacherList.add(new Teacher2());
		
		teacherList.get(0).setName("Mustafa");
		System.out.println(teacherList.get(0).getName());
	}

	public static String printTeachername(Teacher2 t3) {
		t3.setName("Mustafa");
		String name = t3.getName();
		return name;

	}

	public static Teacher2 getTeacher() {
		Teacher2 t4 = new Teacher2();
		t4.setAge(35);
		return t4;
	}
}
