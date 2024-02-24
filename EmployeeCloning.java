
public class EmployeeCloning implements Cloneable {

	public String empId;
	public String name;
	public float salary;
	
	//Creating the object for AddressCloning class
	AddressCloning add = new AddressCloning("ABC", "Vizag");

	public EmployeeCloning() {
		System.out.println("EmployeeCloning Class Public Constructor....");
	}

	public EmployeeCloning(String empId, String name, float salary) {
		System.out.println("EmployeeCloning Class Public Param Constructor....");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee ID     :::::" + empId);
		System.out.println("Employee Name   :::::" + name);
		System.out.println("Employee Salary :::::" + salary);
		//calling the AddressCloning class displayDetails method using add object
		add.displayAddressDetails();
	}

	@Override
	protected EmployeeCloning clone() throws CloneNotSupportedException {

		Object clonedObject = super.clone();

		// Type casting the clonedObject property from Object to EmployeeCloning
		EmployeeCloning emp = (EmployeeCloning) clonedObject;
		
		//Informing to JVM to be clone for Address object as well
		this.add = add.clone();

		return emp;
	}

}
