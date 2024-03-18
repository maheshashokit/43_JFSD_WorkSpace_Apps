package com.ashokit.collections;

import java.util.List;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		//Java9 Style for creating immutable List Object
		List<String> namesList = List.of("Suresh","Rajesh","Ramesh","Nagesh","Mahesh");
		
		//creating the forEach loop for processing elements
		for(String currentItem : namesList) {
			if(currentItem.startsWith("R")) {
				System.out.println("Current Item :::::" + currentItem);
			}
		}
		System.out.println();
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh");
		Employee emp2 = new Employee(354,"Suresh");
		Employee emp3 = new Employee(454,"Rajesh");
		Employee emp4 = new Employee(554,"Ramesh");
		Employee emp5 = new Employee(654,"Mahesh1");
		
		//Creating Java9 Style for Immutable collection
		List<Employee> empList= List.of(emp1,emp2,emp3,emp4,emp5);
		
		//Starting the forEach loop
		for(Employee emp : empList) {
			if("Mahesh".equalsIgnoreCase(emp.getEmpName())) {
				System.out.println(emp.getEmpId() +"============" + emp.getEmpName());
			}
		}
		
	}

}
