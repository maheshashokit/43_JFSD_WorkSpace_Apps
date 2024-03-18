package com.ashokit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class EmployeeStreamMapDemo {

	public static void main(String[] args) {

		// Create Employee Objects
		Employee emp1 = new Employee(123, "Mahesh", "Hyderabad");
		Employee emp2 = new Employee(354, "Suresh", "Bangalore");
		Employee emp3 = new Employee(454, "Rajesh", "Pune");
		Employee emp4 = new Employee(554, "Ramesh", "Hyderabad");

		// Adding the above employees into list object
		List<Employee> empList = List.of(emp1, emp2, emp3, emp4);

		//Requirement to Convert from Employee object into user object
		
		//Traditional Approach
		List<User> userList = new ArrayList<User>();
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee currentEmpObject = iterator.next();
			//EmployeeId in Employee <------------> Username in User
			//EmployeeName in Employee <----------> Password in User
			User user = new User(String.valueOf(currentEmpObject.getEmpId()), currentEmpObject.getEmpName());
			userList.add(user);
		}
		Iterator<User> iterator2 = userList.iterator();
		while(iterator2.hasNext()) {
			 User userObject = iterator2.next();
			 System.out.println(userObject.getUsername()+"---"+ userObject.getPassword());
		}
		
		System.out.println("***********************************************************************");
		
		Function<Employee,User> userFunction = (eachEmployee) -> {
					     return new User(String.valueOf(eachEmployee.getEmpId()),eachEmployee.getEmpName());
					};
		Consumer<User> userConsumer = (eachUser) -> {
						 System.out.println(eachUser.getUsername()+"---"+ eachUser.getPassword());
		            };
		
		//converting collection object into stream object
		empList.stream() //Stream<Employee>
		       .map(userFunction) //Stream<User>
		       .forEach(userConsumer); //displaying the user Information
		
		System.out.println("************************************************************************");
		empList.stream().map((eachEmployee) -> {
					       return new User(String.valueOf(eachEmployee.getEmpId()),eachEmployee.getEmpName());
			       		})
                        .forEach((eachUser) -> {
   						 System.out.println(eachUser.getUsername()+"---"+ eachUser.getPassword());
    		            });
	}
}