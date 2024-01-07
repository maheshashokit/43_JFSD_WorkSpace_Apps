
public class ObjectToPrimitive {

	public static void main(String[] args) {
	
		// Wrapper class objects
		Integer i = new Integer(20);
		Float f = new Float(34.45f);

		// 1. calling non static method of an wrapper class to extract primitive value
		int i1 = i.intValue();
		float f1 = f.floatValue();
		System.out.println("Primitive value of Integer ::::" + i1);
		System.out.println("Primitive value of Float ::::" + f1);

		// 2.Auto Unboxing
		int i2 = i;
		float f2 = f;
		System.out.println("Primitive value of Integer ::::" + i2);
		System.out.println("Primitive value of Float ::::" + f2);
	}

}
