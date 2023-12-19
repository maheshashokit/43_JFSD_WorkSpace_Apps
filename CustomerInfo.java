//This class is used for Has-a Relationship i.e.,Main Object
public class CustomerInfo {

	public String customerId;
	public String customerName;

	// creating object of Address class inside customer class
	Address add = new Address();

	public CustomerInfo(){		 
       System.out.println("Customer Class Default Constructor!!!!");	 
    }

	public CustomerInfo(String customerId,String customerName){	   
      this.customerId = customerId;
      this.customerName = customerName;
    }

	public void displayCustomerInfo() {
		System.out.println(customerId + "====" + customerName);
	}
}
