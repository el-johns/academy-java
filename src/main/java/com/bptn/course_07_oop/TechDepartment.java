package com.bptn.course_07_oop;

class TechDepartment extends Department {
	
	double totalPurchaseAmount;
	
	public TechDepartment(String nameOfDepartment, int numberOfEmployees, double totalPurchaseAmount) {
		super(nameOfDepartment, numberOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

	

}
