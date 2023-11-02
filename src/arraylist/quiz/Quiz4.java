package arraylist.quiz;

import java.util.ArrayList;

public class Quiz4 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student stu = new Student(10,"최씨");
		Student stu1 = new Student(12,"김씨");
		Student stu2 = new Student(14,"박씨");
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		
		for (int i = 0; i < list.size()	; i++) {
			list.get(i).showInfo();
		}
	}
}


class Student{
	int stuId;
	String name;
	
	public Student(int stuId, String name) {
		super();
		this.stuId = stuId;
		this.name = name;
	}
	public void showInfo() {
		System.out.println(stuId + ", " + name);
	}
	
	
}
