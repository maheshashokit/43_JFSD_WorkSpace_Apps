
public class SimpleIfElseDemo {
	
	public static void main(String[] args) {
		System.out.println("Start If-Else Statement!!!!");
		
		//Declaring variable
		int a = 70;
		String name="Mahesh";	        
	
		//Observation Statements
		System.out.println("First Condition" + (a<=50));
		System.out.println("Second Condition" + (name=="Mahesh"));

		//writing the simple if-else statement
		if(a <= 50 && name == "Mahesh"){
			System.out.println("A Value is less than 50 & name is mahesh !!!!");
		}else{
			System.out.println("A Value is More than 50 or either name is not mahesh !!!!");
		}
		
		System.out.println("End If-Else Statement!!!!"); 
	}
}