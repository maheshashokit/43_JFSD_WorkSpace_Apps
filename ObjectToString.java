
public class ObjectToString {

	public static void main(String[] args) {
		
		 //Creating wrapper object
		 Double d = Double.valueOf(253.694d);
		 Integer i = Integer.valueOf(123);
		 
		 //converting the wrapper object into string using toString()
		 String s1 = d.toString();
		 String s2 = i.toString();
		 
		 System.out.println("s1="+s1);
		 System.out.println("s2="+s2);
		 
		 //converting the wrapper object into string using concation 
		 String s3 = "" + d;
		 String s4 = "" + i;
		 System.out.println("s3 =" + s3);
		 System.out.println("s4 =" + s4);
		 
 		 
		 
	}
}
