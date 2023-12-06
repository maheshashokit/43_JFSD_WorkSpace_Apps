
public class NestedForLoopTableDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Started ::: Displaying the Math Tables From 1 To 5....");
		
		for(int tableStartCount = 1; tableStartCount <=5 ; tableStartCount++) {
			
			//tableStartCount = 1....2....3...4....5
			//tableRowCount = 5......10
			for(int tableRowCount = 1; tableRowCount <= 10 ; tableRowCount++) {
					
				System.out.println(tableStartCount  +" * "+ tableRowCount + " = " + (tableStartCount * tableRowCount));
			
			}	
			System.out.println("***************************************");
		}
		
		System.out.println("Ended   ::: Completed the Math Tables Display");
		
	}

}
