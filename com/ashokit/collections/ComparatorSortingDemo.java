package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ComparatorSortingDemo {

	public static void main(String[] args) {

		// Sample Data
		List<Employee1> employees = new ArrayList<Employee1>();

		// adding employee objects into List
		employees.add(new Employee1(123, "Mahesh", "Hyderabad"));
		employees.add(new Employee1(65, "Mahesh", "Hyderabad"));
		employees.add(new Employee1(354, "Suresh", "Bangalore"));
		employees.add(new Employee1(454, "Rajesh", "Pune"));
		employees.add(new Employee1(554, "Ramesh", "Hyderabad"));

		// sorting
		Collections.sort(employees, new EmployeeIdComparator());
		System.out.println("After Sorting:::" + employees);
		//sorting the employees object using EmployeeName
		Collections.sort(employees, new EmployeeNameComparator());
		System.out.println("After Sorting::::" + employees);
		Collections.sort(employees, new EmployeeIdNameCompartor());
		System.out.println("After Sorting" + employees);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//sorting the employees object using java8 comparator
	    Stream<Employee1> sortedEmployees = employees.stream().sorted((o1,o2)-> {
			return o1.getEmpName().compareTo(o2.getEmpName());
	    });
	    sortedEmployees.forEach(eachEmp -> System.out.println(eachEmp));
	    System.out.println();
	    Stream<Employee1> sortedEmps = employees.stream().sorted(new EmployeeIdComparator());
	    sortedEmps.forEach(eachEmp -> System.out.println(eachEmp));
	    
	    System.out.println();
	    Stream<Employee1> sortedEmps1 = employees.stream().sorted(new EmployeeIdComparator().reversed());
	    sortedEmps1.forEach(eachEmp -> System.out.println(eachEmp));		
		

	}

}
