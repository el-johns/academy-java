package com.bptn.course._08_inheritance;

public class Student extends Person {

	protected int studentId;
	
	public Student() { //Default constructor (unparameterized)
		super();
		this.studentId = 0;
	}
	

	public Student(String name, int age, int studentId) { //Parameterized constructor
		super(name, age);
		this.studentId = studentId;
	}
	
	
    //Getters and Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	@Override
	public void display() {
	    //super.display();
		//System.out.println(studentId);
		System.out.println(getName() + " is " + getAge() + " years old and her Student ID is: " + studentId );
	}
	
	public String toString() {
		return getName() + " is " + getAge() + " years old and ID # is: " + studentId;
	}
}
	
