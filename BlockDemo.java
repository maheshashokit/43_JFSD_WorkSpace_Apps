
public class BlockDemo {
	
	public int a;
	public int b;
	
	//Defining the instance block
	{
	   System.out.println("Instance Block Executed.....");
	}
	
	{
		System.out.println("Second Instance Block Executed.....");
	}
	
	//Defining the static block
	static {
		System.out.println("Static Block Executed......");
	}
	
	static {
		System.out.println("Second Static Block Executed......");
	}
	
	//Defining the constructor
    public BlockDemo(int a, int b) {
    	System.out.println("Constructor Executed........");
    	this.a = a;
    	this.b = b;
    }
    
    //Defining the Method to display the data
    public void displayData() {
    	System.out.println("A = " + a);
    	System.out.println("B = " + a);
    }
    
    public static void main(String[] args) {
		
    	//Creating the object for same class
    	BlockDemo bd = new BlockDemo(10,20);
    	bd.displayData();
    	
    	System.out.println("******************************************");
    	
    	BlockDemo bd1 = new BlockDemo(25,25);
    	bd1.displayData();
    }
}
