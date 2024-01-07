
public class StringComparsion {
	
	public static void main(String[] args) {
		
		//Below strings are stored in scp
		String st ="Hyderabad";
		String st1= "hyderabad";
		String st2= "Hyderabad";
		
		//internally comparing on hashcode
		if(st == st1) {
			System.out.println("Both are equal...");
		}else {
			System.out.println("Both are not equal....");
		}
		
		if(st == st2) {
			System.out.println("Both are equal...");
		}else {
			System.out.println("Both are not equal....");
		}
		System.out.println("===================================================");
		
		String st3 = new String("AshokIT");
		String st4 = new String("AshokIT");
		
		if(st3 == st4) {
			System.out.println("Both Are Equal...");
		}else {
			System.out.println("Both Are not Equal...");
		}
		
		if(st3.equals(st4)) {
			System.out.println("Both Contents are Equal....");
		}else {
			System.out.println("Both Contents are Not Equal....");
		}
		
	}

}
