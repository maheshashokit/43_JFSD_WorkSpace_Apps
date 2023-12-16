//This is for Hierarchical Inheritance(Child Class)
public class CustomerDetails extends PersonDetails {
	
	public String customerId;
    public String cityName;
    public double billAmount;

    public void setCustomerDetails(String customerId,String cityName,double billAmount){
          this.customerId = customerId;
          this.cityName = cityName;
          this.billAmount = billAmount;
    }

    public void displayCustomerDetailsInfo(){
         System.out.println("*********Customer Information********************");
         System.out.println("CustomerID ::" + customerId+" City Name ::" + cityName+" BillAmount ::" + billAmount); 
    }
}