public class NestedForLoopStarPatternDemo {

	public static void main(String[] args) {
		
		for(int noOfLines=1 ; noOfLines <=5 ; noOfLines++) {
			
			for(int noOfStars = 1; noOfStars <= noOfLines ; noOfStars++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
}