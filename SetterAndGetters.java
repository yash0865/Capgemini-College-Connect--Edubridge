package com.edubridge;


class Employe{
	private int id;
	private String name;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class SetterAndGetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp = new Employe();
		emp.setId(10);
		emp.setName("Yash");
		System.out.println(emp.getId() + " " + emp.getName());
	}

}
