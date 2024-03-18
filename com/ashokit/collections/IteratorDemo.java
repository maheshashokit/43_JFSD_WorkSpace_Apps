package com.ashokit.collections;

import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		//creating Java9 style for creating immutable collection
		List<String> namesList = List.of("Satish","Rao","Ramesh","Abdul","Smith","Mark");
		
		//getting the Iterator object of namesList
		Iterator<String> namesIterator = namesList.iterator();
		
		//processing the namesIterator
		while(namesIterator.hasNext()) {
			//getting the current element
			String currentName = namesIterator.next();
			System.out.println("Current Name ::::" + currentName);
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
  		
  		Iterator<Employee> empIterator = empList.iterator();
  		while(empIterator.hasNext()) {
  			Employee currentEmp = empIterator.next();
  			System.out.println(String.format("Employee Id : %s and Employee Name : %s",currentEmp.getEmpId(),currentEmp.getEmpName()));
  		}
	}
}