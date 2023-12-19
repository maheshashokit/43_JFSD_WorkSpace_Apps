
public class HierarchicalInheritanceClient {
	
	public static void main(String[] args) {
		
		//Creating the Object for Employee Details
		EmployeeDetails ed = new EmployeeDetails();
		
		//Calling the Parent Class
		ed.setPersonDetails("Mahesh", "Mahesh.ashokit@gmail.com", "1234567890");
		//calling the Child Class 
		ed.setEmployeeDetails("AIT123", "Java Trainer", 25000d, "A");

		//displaying the Details
		ed.displayPersonalDetailsInfo();
		ed.displayEmployeeDetailsInfo();
		
		System.out.println("+====================================================+");
		
		CustomerDetails cd = new CustomerDetails();
		
		//calling the Parent Class
		cd.setPersonDetails("Ashok", "ashokitschools@gmail.com", "235698741");
		//calling the child class
		cd.setCustomerDetails("AIT321", "Hyderabad", 256987d);
		
		//displaying data
		cd.displayPersonalDetailsInfo();
		cd.displayCustomerDetailsInfo();
	}
}