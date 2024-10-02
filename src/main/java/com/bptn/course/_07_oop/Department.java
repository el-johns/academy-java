package com.bptn.course._07_oop;

class Department {
	
	private String nameOfDepartment;
	private int numberOfEmployees;
	
	
	public Department(String nameOfDepartment, int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
		this.nameOfDepartment = nameOfDepartment;
	}
	
	public void deptInfo() {
		System.out.println("Name of Department: " + nameOfDepartment);
		System.out.println("Number of Empoyees: " + numberOfEmployees);
		System.out.println("totalSalesAmount: " + 500);
	}
	

}
