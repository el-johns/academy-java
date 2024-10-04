package com.bptn.course._08_inheritance;

public class Person {
	
	//Instance attributes
	private String name;
	private int age;
	
	
	//Constructor - called when an object/instance of a class is created
	public Person() { //Using default constructor (no parameters)
		name = "Unknown Name";
		age = 0;
	}
	
	public Person(String name, int age) { //Using parameterized constructors
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
