package com.bptn.course_07_oop;

class SalesDepartment extends Department {
	
	double totalSalesAmount;
	
	public SalesDepartment(String nameOfDepartment, int numberOfEmployees, double totalSalesAmount) {
		super(nameOfDepartment, numberOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	}
	
	
	}

	
