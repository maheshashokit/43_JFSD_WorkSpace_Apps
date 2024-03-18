package com.ashokit.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ClassCastExceptionDemo {
	
	public static void main(String[] args) {
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh","Hyderabad");
		Employee emp2 = new Employee(354,"Suresh","Bangalore");
		Employee emp3 = new Employee(454,"Rajesh","Pune");
		Employee emp4 = new Employee(554,"Ramesh","Hyderabad");
		
		//adding the above employee objects into SortedSet Object
		SortedSet<Employee> employeeSet = new TreeSet<>();
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
		System.out.println("Employee Set::::"+ employeeSet);
	}

}
