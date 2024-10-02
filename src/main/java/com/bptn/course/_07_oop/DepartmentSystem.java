package com.bptn.course._07_oop;

public class DepartmentSystem {

public static void main(String[] args) {
		
		SalesDepartment mainInfo = new SalesDepartment("Human Resources", 50, 3000);
		mainInfo.deptInfo();
		
		SalesDepartment newMainInfo = new SalesDepartment("Technology", 70, 275);
		newMainInfo.deptInfo();
		
		

	}

}
