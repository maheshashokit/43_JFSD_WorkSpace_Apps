package com.ashokit.exceptions;

public class Employee {

	//Defining the Fields
	int employeeId;
	String name;
	String designation;
	double salary;
	
	//Defining the method to assign values to fields
	void assigningData(int empId,String empName,String empDesignation,double empSalary) {
		
		//assigning the method parameters to fields of class
		employeeId = empId;
	    name = empName;
	    designation = empDesignation;
	    salary = empSalary;
	}
	
	//Defining the method to display the values from Fields
	void displayData() {
		System.out.println(" Employee ID          ::::::" + employeeId);
		System.out.println(" Employee Name        ::::::" + name);
		System.out.println(" Employee Designation ::::::" + designation);
		System.out.println(" Employee Salary      ::::::" + salary);
	}
}
