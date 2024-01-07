
public class PrimitiveToString {
	
	public static void main(String[] args) {
		
		//Defining the Primitives
		double d = 2357.568d;
		int c = 25647;
		
		//Converting the primitives into String value using toString();
		String st = Double.toString(d);
		String st1 = Integer.toString(c);
		System.out.println("st = " + st);
		System.out.println("st1 = " + st1);
		
		//converting the primitives into string value using concation operation
		String st2  = "" + d;
		String st3  = "" + c;
		System.out.println("st2 = " + st2);
		System.out.println("st3 = " + st3);
  		
		
		
		
	}

}
