import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		//Creating the object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Value for Addition");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Value for Addition");
		int b = sc.nextInt();
		
		//performing the addition operation
		int c = a + b;
		
		//printing the addition value
		System.err.println("Sum Of Two Numbers ::::" + c);
		
		sc.close();
		 
	}
}
