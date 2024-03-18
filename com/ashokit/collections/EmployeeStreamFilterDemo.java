package com.ashokit.collections;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeStreamFilterDemo {
	
	public static void main(String[] args) {
		
		//Create Employee Objects
		Employee emp1 = new Employee(123,"Mahesh","Hyderabad");
		Employee emp2 = new Employee(354,"Suresh","Bangalore");
		Employee emp3 = new Employee(454,"Rajesh","Pune");
		Employee emp4 = new Employee(554,"Ramesh","Hyderabad");
		
		//Adding the above employees into list object
		List<Employee> empList = List.of(emp1,emp2,emp3,emp4);
		
		//Traditional Approach
		Iterator<Employee> empIterator = empList.iterator();
		while(empIterator.hasNext()) {
			Employee currentEmpObject = empIterator.next();
			if("Hyderabad".equalsIgnoreCase(currentEmpObject.getLocation())) {
				System.out.println(currentEmpObject.getEmpId()+"-"+currentEmpObject.getEmpName()+"-"+currentEmpObject.getLocation());
			}
		}
		
		System.out.println("*******************************************");
		//FulFilling the task using Java8 Streams
		
		//Developing the predicate functional interface implementation to find location of employee is hyderabad or not
		Predicate<Employee> empLocationPredicate = (employeeObject) -> {
			//If it is Hyderabad means will return true otherwise false
			return "Hyderabad".equalsIgnoreCase(employeeObject.getLocation());
		};
		
		//Developing the consumer functional interface implementation to display filtered employee data
		Consumer<Employee> displayEmployeeConsumer = (eachEmployee) ->{
			System.out.println(eachEmployee.getEmpId() +"-"+ eachEmployee.getEmpName()+"-"+ eachEmployee.getLocation());
		};
		
		//Java8 Stream Statements
		empList.stream().filter(empLocationPredicate).forEach(displayEmployeeConsumer);
		
		System.out.println("**************************************************");
		
		//Refactoring the second technique into single line of code
		empList.stream().filter(eachEmployee -> {
		     return "Hyderabad".equalsIgnoreCase(eachEmployee.getLocation());
		}) //filtered employees information only i.e.,2 employees
		.forEach(filteredEmpObject -> {
			System.out.println(filteredEmpObject.getEmpId()+"-"+ filteredEmpObject.getEmpName()+"-"+ filteredEmpObject.getLocation());
		});		
	}
}