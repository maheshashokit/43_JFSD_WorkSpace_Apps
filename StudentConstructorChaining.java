
public class StudentConstructorChaining {

	private int rollNo;
	private String name;

	// Defining the non-parameterized constructor
	public StudentConstructorChaining() {
		System.out.println("StudentConstructorChaining :::: Non-Parameterized Constructor.....");
	}

	// Defining the single parameterized constructor
	public StudentConstructorChaining(int rollNo) {
		this(rollNo,"Mahesh"); //calling the another constructor
		System.out.println("StudentConstructorChaining:::Single-Parameterized Constructor...");
	}

	// Defining the two Parameterized Constructor
	public StudentConstructorChaining(int rollNo,String name) {
		System.out.println("StudentConstructorChaining::::Two-Parameterized Constructor.....");
		this.rollNo = rollNo;
		this.name = name;
	}

	public void displayStudentInfo() {
		System.out.println("Student Roll No ::::::" + rollNo);
		System.out.println("Studnet Name    ::::::" + name);
	}

	public static void main(String[] args) {

		StudentConstructorChaining s = new StudentConstructorChaining(01, "Suresh"); // It will call two parameterized constructor
		s.displayStudentInfo();

		System.out.println("***************************************************");
		
		StudentConstructorChaining s1 = new StudentConstructorChaining(25); // It will call one Parameterized constructor
		s1.displayStudentInfo();

		
	}
}
