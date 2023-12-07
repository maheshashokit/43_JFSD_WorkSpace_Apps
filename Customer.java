
public class Customer {
	
	//Defining the Fields
	int customerId;
	String name;
	String location;
	double billAmount;
	
	//Defining the Methods
	void assigningData(int custId,String custName,String custLocation,double custBillAmt) {
		
		//assigning the data from method parameters to Fields of Class
		customerId = custId;
		name = custName;
		location = custLocation;
		billAmount = custBillAmt;
	}
	
	//Defining the method to display the customer data
	void displayCustomerInformation() {
		System.out.println(" Customer ID             ::::::" + customerId);
		System.out.println(" Customer Name           ::::::" + name);
		System.out.println(" Customer Location       ::::::" + location);
		System.out.println(" Customer BillAmount     ::::::" + billAmount);
		//Method calling to print the data of Methods
		System.out.println(" Customer Discount %     ::::::" + getDiscountPercentage());
		System.out.println(" Customer Discount Amt   ::::::" + getDiscountAmount());
		System.out.println(" Customer Final Bill Amt ::::::" + getFinalBillAmount());
	} 
	
	//Defining the method to get discountPercentage based on billAmount
	double getDiscountPercentage() {
		
		double discountPercentage = 0.0d;
		
		if(billAmount  < 5000) {
			discountPercentage =  0.05d;
		}else if(billAmount >= 5000 && billAmount < 10000) {
			discountPercentage =  0.10d;
		}else if(billAmount >= 10000){
			discountPercentage =  0.15d;
		}
		
		return discountPercentage;
	}
	
	//Defining the method to get discountAmount based on discountPercentage & billAmount
	double getDiscountAmount() {
		
		//calling the method to get the discountPercentage
		double discountPercentage = getDiscountPercentage();
	
		//calculating the discount amount
		double discountAmount = billAmount * discountPercentage;
		
		return discountAmount;
	}
	
	//Defining the method to get final bill Amount
	double getFinalBillAmount() {
		
		//get the discountAmount value
		double discountAmount = getDiscountAmount();
		
		//calculating the FinalBillAmount
		double finalBillAmount = billAmount - discountAmount;
		
		return finalBillAmount;
		
	}
	
	public static void main(String[] args) {
		
		//Creating the Customer Class Object
		Customer customer = new Customer();
		
		//assingingData to Customer
		customer.assigningData(123, "Mahesh", "Hyderabad", 4500);
		
		//displaying the customerInformation
		customer.displayCustomerInformation();
	}
}