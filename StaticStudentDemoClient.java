
public class StaticStudentDemoClient {

	public static void main(String[] args) {
		
		//Creating the object to access the Instance Data
		StudentDemo sd  = new StudentDemo("AIT123","Mahesh");
		
		//Accessing the instance methods
		sd.displayStudentDetails();
		
		 //Accessing the Static Data with out Object
		System.out.println("Accessing Static Field With Out Object:::::" + StudentDemo.collegeName);
		StudentDemo.displayCollegeDetails();
		
		System.out.println("Square::::" + square(12));
		System.out.println("Square::::" + StaticStudentDemoClient.square(12));
		
		System.out.println("Student Object sd :::::" + sd);
		System.out.println("Student Object sd-1 :::::" + sd.toString());
	}
	
	public static int square(int x) {
		return x * x;
	}
}