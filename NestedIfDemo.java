public class NestedIfDemo {
	
	public static void main(String[] args) {
		System.out.println("Start ::::: Nested-If Demo Program.....");

		//Declaring the variables
		int a = 80;
		int b = 120;

		//writing outer if statement
		if(a > b){		 
		  System.out.println("Start ::::: Outer if Statement is passed....." + a);
		  //inner if condition
          if(b < 10){
		    System.out.println("Inner if statement got passed::::" +a+ " " + b);
		    if(a == 10) {
		      System.out.println("Sub Inner If Statement got passed because of 10");
		    }
		  }		
          System.out.println("End ::::: Outer if Statement is passed....." + a);
		}	      
        System.out.println("End ::::: Nested-If Demo Program.....");
	}
}