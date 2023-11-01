package array.quiz;

public class Quiz8 {
	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		studentArr[0] = new Student(1,"김씨");
		studentArr[1] = new Student(2,"이씨");
		studentArr[2] = new Student(3,"박씨");
		
		for (Student student : studentArr) {
			student.showInfo();
		}
		
		for (int i = 0; i < studentArr.length; i++) {
			studentArr[i].showInfo();
		}
	}
}

class Student{
	int stuNo;
	String name;
	
	public Student(int stuNo, String name) {
		super();
		this.stuNo = stuNo;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(stuNo + ", " + name);
	}
	
	
}
