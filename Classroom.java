package com.codingChallenges;

class Student{
	String name;
	int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

public class Classroom {
	public String registerStudent(Student student) {
		if(student.name != student.name.toUpperCase()) {
			return "Block letters needed";
		}
		if(student.score < 0 && student.score > 100) {
			return "Invalid score";
		}
		return "Registered";
	}
	
	public String studentCard(String card) {
		try {
			Integer c = Integer.parseInt(card);
		}catch (NumberFormatException e) {
			return "Invalid Card";
		}
		return "Valid Card";
	}

	public static void main(String[] args) {
		Student s1 = new Student("AB",6);
		Classroom cm = new Classroom();
		System.out.println(cm.registerStudent(s1));
		System.out.println(cm.studentCard("11*1"));
	}

}
