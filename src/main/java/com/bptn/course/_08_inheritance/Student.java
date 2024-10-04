package com.bptn.course._08_inheritance;

public class Student extends Person {

	private int studentId;
	
	//public Student() {
		//super();
		//this.studentId = 0;
	//}
	

	public Student(String name, int age, int studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


}
