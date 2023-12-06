
public class WhileTableDemo {
	
	public static void main(String[] args) {
		
		int requiredTableNumber = 25;
		
		int loopStart = 1;
		
		while(loopStart <=10) {
		 
			//requiredTableNumber "*" loopStart "=" requiredTableNumber * loopStart
		   System.out.println(requiredTableNumber +" * "+ loopStart +" = "+ (requiredTableNumber * loopStart));
		   
		   loopStart++;
		}
		
	}

}
