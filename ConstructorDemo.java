package com.edubridge;

class Student{
	int studId;
	String studName;
	
	public Student(int studId, String studName) {
		this();
		this.studId = studId;
		this.studName = studName;
		
		
	}
	
	public Student() {
		System.out.println("Npsdf");
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(10,"Yash");
		System.out.println(student);
	}

}
