package com.edu.pack1;

public class Student {
	private String name;
	private int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
}
