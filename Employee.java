
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
	
	//Defining the main method to create the objects for class
	public static void main(String[] args) {
		
		//creating the object for Employee class
		Employee emp = new Employee();
		
		System.out.println("Employee Id::::" + emp.employeeId);		
		System.out.println("Employee Name::::" + emp.name);
		
		//Calling the method
		emp.assigningData(123, "Mahesh", "Software Engineer", 25000.00d);
		
		//calling the method to display the data
		emp.displayData();
		
		System.out.println("========================================================");
		
		Employee emp2 = new Employee();
		
		//calling the method
		emp2.assigningData(321, "Ashok", "Tech Lead", 5000.00d);
		
		//calling the method to display the data
		emp2.displayData();
		
	}
}
