
public class WhileEvenNumbersDemo {

	public static void main(String[] args) {
		
		//loop intialization variable
		int loopStart = 1;
		
		//loop condition
		while(loopStart <= 10) {
			
			if(loopStart % 2 != 0) {
				//System.out.println("Even Number is :::"+ loopStart);
				System.out.print(loopStart + " ");
			}
			
			//updating the counter variable
			//loopStart = loopStart + 1;
			loopStart++;
		}
	}
}