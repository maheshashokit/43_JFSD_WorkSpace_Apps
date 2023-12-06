
public class EnhancedForLoopDemo {
	
	public static void main(String[] args) {
		
		//Defining the int array & String array
		int marks[] = {10,20,30,40,50};
		
		String names[]= {"Mahesh","Suresh","Rajesh"};
		
		System.out.println("Marks Array:::"+ marks);
		System.out.println("Names Array:::"+ names);
		
		//processing the marks[] using Enhanced For loop
		for(int marksValue  : marks) {
			System.out.println("Marks:::"+ marksValue);
		} 
		
		System.out.println("***************************************");
		
		//processing the names[] Using Enhanced For loop
		for(String nameValue : names) {
			System.out.println("Names:::" + nameValue);
		}
		
		
		System.out.println("****************************************");
		
		System.out.println("Array length::::"+ marks.length); //5
		for(int i = 0 ; i < marks.length ; i++) {
			System.out.println("Marks Array Values::::" + marks[i]);
		}
		
		System.out.println("*****************************************");
		System.out.println("Names Array length ::::" + names.length);//3
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println("Names Array Values::::" + names[i]);
		}
		
	}

}
