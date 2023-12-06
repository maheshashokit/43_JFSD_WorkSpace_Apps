
public class DecrementOperatorDemo {
	
	public static void main(String[] args) {		
		int b = 34;
		System.out.println("Current Value::::"+ b);//34
		//First return value >>> perform operation(33) 		
		System.out.println("Decrement Operator-1:::::" + (b--));//34 >>> 33
		System.out.println("Decrement Operator-2:::::" + (--b));//32 >>> 32
		System.out.println("Increment Operator-3:::::" + (b++));//32
		System.out.println("Increment Operator-4:::::" + (++b));//34
		
		System.out.println("*******************************************");
		int d = 40;
		int c = d-- + --d;
		System.out.println("Output Value of C::::" + c);
	}
}