package com.ashokit.collections;

import java.util.List;

public class StreamLimitDemo {
	public static void main(String[] args) {

		// creating the collection for holding the data
		List<String> names = List.of("Suresh", "Mahesh", "Rajesh", "Anil", "Balu");

		// Create Employee Objects
		Employee emp1 = new Employee(123, "Mahesh", "Hyderabad");
		Employee emp2 = new Employee(354, "Suresh", "Bangalore");
		Employee emp3 = new Employee(454, "Rajesh", "Pune");
		Employee emp4 = new Employee(554, "Ramesh", "Hyderabad");

		List<Employee> employees = List.of(emp1, emp2, emp3, emp4);

		// 1.Traditional Approach to be display only 3 elements
		for (int i = 0; i < 3; i++) {
			System.out.println(names.get(i));
		}

		for (int i = 0; i < 2; i++) {
			Employee employee = employees.get(i);
			System.out.println(employee.getEmpId() + "====" + employee.getEmpName() + "====" + employee.getLocation());
		}

		System.out.println("*****************************************************");

		// 2.Stream approach to get limited values from stream of elements
		names.stream() //Stream<String> of 5 Elements
		     .limit(3) //Stream<String> of 3 Elements
		     .forEach(eachName -> System.out.println(eachName)); //displaying eachElement

		// Getting first 2 Employee objects
		employees.stream() //Stream<Employee> of 4 objects
		        .limit(2) //Stream<Employee> of 2 Objects
		        .forEach(eachEmp -> 
		        System.out.println(eachEmp.getEmpId() + "====" + eachEmp.getEmpName() + "====" + eachEmp.getLocation()));//displaying the each Employee
	}
}
