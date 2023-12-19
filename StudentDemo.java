
public class StudentDemo {
	
	public String studentId;
	public String studentName;
	public static String collegeName ="Ashok IT College";
	
	//Defining the constructor
	public StudentDemo() {
		System.out.println("StudentDemo Class Constructor...");
	}
	
	public StudentDemo(String studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	//Defining the instance method to display the data
	public void displayStudentDetails() {
		System.out.println("Student ID    :::::" + studentId);
		System.out.println("Student Name  :::::" + studentName);
		//Accessing the static field by instance method
		System.out.println("College Name  :::::" + collegeName);
	}
	
	public static void displayCollegeDetails() {
		System.out.println("College Name  :::::" + collegeName);
		//Not Accessable Instance Field by the Static methods
		//System.out.println("Student ID    :::::" + studentId);
	}
}