//This Class is used working with constructor
public class EmployeeConstructor {

	//Defining the fields
	private int empId;
	private String empName;
	
	//Defining the non-parameterized Constructor
	private EmployeeConstructor() {
		System.out.println("Non-Parameterized Constructor Executed.....");
	}
	
	//Defining the Parameterized constructor
	private EmployeeConstructor(int employeeId,String employeeName) {
		System.out.println("Parameterized Constrcutor Exexcuted......");
		empId = employeeId;
		empName = employeeName;
	}
	
	//Defining some more constructors
	private EmployeeConstructor(int employeeId) {
		System.out.println("Single int type parameter constructor executed....");
		empId = employeeId;
	}
	
	//Defining the constructor
	private EmployeeConstructor(String employeeName) {
		System.out.println("Single String type parameter constructor executed....");
		empName = employeeName;
	}
	
	//Defining the constructor to copy the data from one object to another object
	private EmployeeConstructor(EmployeeConstructor empConstructor) {
		this.empId = empConstructor.empId;
		this.empName = empConstructor.empName;
		
	}
	
	//Defining the method to display the data
	public void displayData() {
		System.out.println("Employee ID    :::::" + empId);
		System.out.println("Employee Name  :::::" + empName);
	}
	
	//Defining the main method
	public static void main(String[] args) {
		
		//Creating the object for our class
		EmployeeConstructor ec = new EmployeeConstructor();
		//calling the displayData method
		ec.displayData(); //0 && null
		
		System.out.println("EmployeeConstructor hashCode......" + ec.hashCode());
		
		System.out.println();
		
		//Creating the object for our class
		EmployeeConstructor ec1 = new EmployeeConstructor(10,"Mahesh");
		//calling the displayData Method
		ec1.displayData();// 10 && Mahesh

		System.out.println();
		
		//Creating the object
		EmployeeConstructor ec2 = new EmployeeConstructor(115);
		//calling the displayData Method
		ec2.displayData();
		
		System.out.println();
		
		EmployeeConstructor ec3 = new EmployeeConstructor("Ashok");
		//calling the displayData Method
		ec3.displayData();
		
		System.out.println();
		//copy constructor
		EmployeeConstructor ec4  = new EmployeeConstructor(ec1);
		ec4.displayData();
	}
	

}
