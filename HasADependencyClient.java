
public class HasADependencyClient {
	
	//instance Field (or) non-static Field
	static int sum;
	
	public static void main(String[] args) {
		
		//Creating the Main Object
		CustomerInfo cust = new CustomerInfo();
		
		System.out.println("Customer ID :::::" + cust.customerId); //null
		System.out.println(cust.add); //Printing the Address Object
		
		//calling the Address Class Methods using Main Object
		cust.add.setAddressDetails("1-2-3", "XYZ", "Hyderabad", "500089");
		cust.add.displayAddressInfo();
		
		sum = 10;
		setSum(10);
	}
	
	//non-static method (or) instance method
	public static void setSum(int sum) {
		System.out.println("This is Static Method.....");
	}
}