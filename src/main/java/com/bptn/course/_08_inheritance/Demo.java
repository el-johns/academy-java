package com.bptn.course._08_inheritance;

public class Demo {

	public static void main(String[] args) {
		
		
		//Creating an object of the Person class
		//Person p = new Person();
		//p.setName("Lucy");
		//p.setAge(25);
		
		//creating an object of the student class
		Student x = new Student("Lucy", 25, 123450);
		//x.setName("Kelly");
		//x.setAge(27);
		//x.setStudentId(12345);
		
		//System.out.println(p.getName() + " is " + p.getAge() + " years old.");
		System.out.println(x.getName() + " is " + x.getAge() + " years old and her Student ID is: " + x.getStudentId());

	}

}
