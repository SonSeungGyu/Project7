package arraylist;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		Student stu1 = new Student("둘리");
		stu1.subList.add(new Subject("국어", 100));
		stu1.subList.add(new Subject("수학", 50));
		stu1.showInfo();
		
		Student stu2 = new Student("도우너");
		stu2.subList.add(new Subject("국어", 70));
		stu2.subList.add(new Subject("영어", 85));
		stu2.subList.add(new Subject("과학", 70));
		stu2.subList.add(new Subject("사회", 85));
		stu2.showInfo();
	}
}

class Subject{
	String name;
	int score;
	
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
}

class Student{
	String stuName;
	ArrayList<Subject> subList;//수강과목을 저장할 리스트
	
	public Student(String stuname) {
		this.stuName = stuname;
		subList = new ArrayList<Subject>();//리스트 생성
	}
	
	public void showInfo() {
		int total = 0;
		
		for (Subject subject : subList) {
			total = total + subject.score;
		}
		System.out.println(stuName + " 학생의 총점은 " + total + " 입니다.");
	}
}
