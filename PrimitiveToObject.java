
public class PrimitiveToObject {
	public static void main(String[] args) {
		
		int i = 30;
		System.out.println("i = " + i);
		double d = 30.25d;

		// 1.Passing this primitive to Wrapper Class Parameterized Constructor
		Integer i1 = new Integer(i);
		System.out.println("Integer Object Value ::::" + i1);
		Double d1 = new Double(d);
		System.out.println("Double Object Value :::::" + d1);

		// 2.Calling the static method from wrapper class to convert an wrapper object
		// from primitive value
		Integer i2 = Integer.valueOf(i);
		Double d2 = Double.valueOf(d);
		System.out.println("Integer Object Value-2:::" + i2);
		System.out.println("Double Object Value-2:::" + d2);
		System.out.println("Integer Object Value-4:::" + i2.toString());
		System.out.println("Double Object Value-4::" + d2.toString());
		

		// 3. working with AutoBoxing
		Integer i3 = i;
		Double d3 = d;
		System.out.println("Integer Object Value-3:::" + i3);
		System.out.println("Double Object Value-3:::" + d3);

	}

}
