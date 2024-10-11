package com.bptn.course._10_abstract_classes;

public abstract class Animal {

	public abstract void sound();

	public void sleep() {
		System.out.println("Animal is sleeping");
	}

}

class Dog extends Animal {
	public void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Cat meows");
	}
}
