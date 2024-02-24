
public class CommadLineArgumentsApp {

	public static void main(String[] args) {
		
		System.out.println("Processing ::: Command Line Arguments");
		
		for(String eachElement : args) {
			System.out.println("Each Element:::::" + eachElement);
		}	
		//conversion of String into primitive using wrapper class
		int parseInt = Integer.parseInt(args[2]);
		System.out.println("Integer Value::::" + parseInt);
		System.out.println("Ending     ::: Command Line Arguments");

	}

}
