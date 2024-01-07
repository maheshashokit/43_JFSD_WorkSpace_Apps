
public class StringToPrimitive {
	
	public static void main(String[] args) {
		
		int intValue = Integer.parseInt("10");
		float floatValue = Float.parseFloat("10.256f");
		double doubleValue = Double.parseDouble("10.2568d");
		
		System.out.println("int value ::::" + intValue);
		System.out.println("float value ::::" + floatValue);
		System.out.println("Double Value ::::" + doubleValue);
		
		String st ="Mahesh";
		Integer.parseInt(st);
		
	}

}
