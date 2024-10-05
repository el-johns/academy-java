package com.bptn.course._08_inheritance;

public class Demo {

	public static void main(String[] args) {
		
		
		//Creating an object of the Person class
		Person p = new Person();
		//p.setName("Lucy");
		//p.setAge(25);
		
		//creating an object of the student class
		Student x = new Student("Kelly", 28, 123450);
		//x.setName("Kelly");
		//x.setAge(27);
		//x.setStudentId(12345);
		
		Student y = new Student("Mark", 24, 153450);
		
		//p.display();
		//x.display();
		
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(x);
		System.out.println(y);
		
		if (x.equals(y))
			System.out.println("We are equal");
			else
				System.out.println("We are not equal");

	}

}
