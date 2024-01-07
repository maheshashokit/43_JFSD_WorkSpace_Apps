
public class StringToWrapperObject {

	public static void main(String[] args) {
	
		String s = "34";

		// 1.passing the string parameter to required wrapper class constructor
		Integer i = new Integer(s);
		Float f = new Float(s);
		System.out.println("Object Value of Integer::::" + i);
		System.out.println("Object Value of Float::::" + f);

		// 2. calling the static method of required wrapper class i.e.,valueOf()
		Integer i2 = Integer.valueOf(s);
		Float f2 = Float.valueOf(s);
		System.out.println("Object Value of Integer::::" + i2);
		System.out.println("Object Value of Float::::" + f2);
	}
}
