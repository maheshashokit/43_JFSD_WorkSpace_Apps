
public class EmployeeCloningClient {

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("**************Main Object****************");
		// Creating the object for Employee class
		EmployeeCloning emp = new EmployeeCloning("AIT123", "Mahesh", 25000f);

		// calling displayEmployeeDetails()
		emp.displayEmployeeDetails();

		// calling hashcode method for getting to know about main object
		System.out.println("Main Object HashCode:::::" + emp.hashCode());// 112233
		System.out.println("Main Object and its Address hashcode:::" + emp.add.hashCode());
		

		System.out.println("**************Cloned Object****************");
		EmployeeCloning emp1 = emp.clone();
		// calling the displayEmployeeDetails()
		emp1.displayEmployeeDetails();

		// calling hashcode method for getting to know about Cloned object
		System.out.println("Cloned Object HashCode:::::" + emp1.hashCode());// 334455
		System.out.println("Cloned Object and its Address Hashcode :::::" + emp1.add.hashCode());
		
		System.out.println("*****************Doing Changes in Address object***************");
		
		//modifying the address object through cloned object
		emp1.add.cityName="Hyderabad";
		
		//ensuring the will be impact the main object
		System.out.println("Cloned Object data ::::" + emp1.add.cityName);//Hyderabad
		System.out.println("Main   Object data ::::" + emp.add.cityName);//vizag
		
		System.out.println("main object address hashcode" + emp.add.hashCode());
		System.out.println("cloned object address hashcode" + emp1.add.hashCode());
		
		//shallow cloning or deep cloning
		if(emp.add.hashCode() == emp1.add.hashCode()) { //false
			System.out.println("Shallow cloning........");
		}else {
			System.out.println("Deep Cloning......");
		}
		
		EmployeeCloning emp4 = emp;
		System.out.println("emp4::::" + emp4.hashCode());
		System.out.println("emp::::" + emp.hashCode());
	}
}