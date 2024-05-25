package com.ashokit.collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByDemo {

	public static void main(String[] args) {

		// Create Employee Objects
		Employee emp1 = new Employee(123, "Mahesh", "Hyderabad");
		Employee emp2 = new Employee(354, "Suresh", "Bangalore");
		Employee emp3 = new Employee(454, "Rajesh", "Pune");
		Employee emp4 = new Employee(554, "Ramesh", "Hyderabad");

		// Adding the above employees into list object
		List<Employee> empList = List.of(emp1, emp2, emp3, emp4);
		
		//grouping the data
		//Map<String,List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(emp -> emp.getLocation()));
		Map<String,List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getLocation));
		empMap.entrySet().forEach(eachEntry -> {
			System.out.println(eachEntry.getKey() +"---->"+ eachEntry.getValue());
		});
		
		//grouping the data with count value
		//Map<String,Long> empMap1 = empList.stream().collect(Collectors.groupingBy(emp -> emp.getLocation(),Collectors.counting()));
		Map<String,Long> empMap1 = empList.stream().collect(Collectors.groupingBy(Employee::getLocation,Collectors.counting()));
		System.out.println(empMap1);
	}

}
