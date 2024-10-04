package com.bptn.course._08_inheritance;

//Complete building up this class
public class NewStudent extends Member {

	//Instance attributes
	private int newScore;


	public NewStudent(String name, int id, int newScore) { //Constructor with parameters
		super(name, id); //inherited from the parent class above
		this.newScore = newScore;//same as above
	}
	public String toString() {
		return super.toString() + " " + newScore;
	}


}


