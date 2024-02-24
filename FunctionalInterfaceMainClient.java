import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceMainClient {
	
	public static void main(String[] args) {
		
		//AdditionFunctionalInterface
		AdditonFunctionalInterface afi = (x,y) -> {
														return x + y;
												  };
	    
		//calling abstract method of AdditionFunctionalInterface
		System.out.println("Addition:::" + afi.performAddition(10, 20));
		
		//Predefined Functional interface
		Predicate<String> checkUsername = (username) -> {
												    		if("Mahesh".equalsIgnoreCase(username)) {
												    			return true;
												    		}else{
												    			return false;
												    		}
														};
	   //calling the abstract method
	   System.out.println("Checking the Condition-1:::" + checkUsername.test("Mahesh"));
	   System.out.println("Checking the Condition-2:::" + checkUsername.test("Ashok"));
	   System.out.println("Checking the Condition-3:::" + checkUsername.test("Suresh"));
	   System.out.println("Checking the Condition-4:::" + checkUsername.test("Ajay"));
	
	   System.out.println("=====================================================");
		  
	   //Function Functional Interface
	   Function<String,Integer> testFunction = (str) -> {
		   													return Integer.valueOf(str);	
	   													};
	   System.out.println("Test-1::::"+ testFunction.apply("10"));
	   System.out.println("Test-2::::"+ testFunction.apply("123"));
	   System.out.println("Test-3::::"+ testFunction.apply("12345"));
	   
	   CustomerInfo customer = new CustomerInfo("AIT123","Mahesh");
	   Function<CustomerInfo,String> custFunction = (cust) -> {
		   														return customer.customerId;
	   														  };
	  
	   	System.out.println("CustomerTest-1::::" + custFunction.apply(customer));
	   	
	   	System.out.println("=====================================================");
	  
	   	//Consumer Functional interface
	   	Consumer<CustomerInfo> custConsumer = (cust) ->{
												   			System.out.println("Customer-ID   ::::" + cust.customerId);
												   			System.out.println("Customer-Name ::::" + cust.customerName);
					 							       };
		custConsumer.accept(customer);
		
		System.out.println("=====================================================");
		Supplier<CustomerInfo> suplierCust = () -> {
			return new CustomerInfo("AIT1234","Suresh");
		};
		System.out.println(suplierCust.get().customerId);
		System.out.println(suplierCust.get().customerName);
	}
}