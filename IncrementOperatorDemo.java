
public class IncrementOperatorDemo {
	
	public static void main(String[] args) {
		
		int a = 20;
		
		//Incrementing the value >>>> Return the value(Console)>>> Assign value to variable
		System.out.println("Before A Value :::::" + a);//20
		System.out.println("Pre Increment ::::" + (++a));//21
		System.out.println("After A Value :::::" + a);//21
		System.out.println("Again Pre Increment:::::" +(++a));//22
		System.out.println("Current A Value :::::" + a);//22
		
		System.out.println("**********************************************");
		
		//Post Increment operations
		int b  = 30;
		System.out.println("Before Operation:::::" + b);//30
		System.out.println("Post Increment value:::::" + (b++));//30
		System.out.println("Internal Value of B :::::" + b);//31
		
		System.out.println("Post Increment value:::::" + (b++));//31 >>> 32
		System.out.println("Post Increment value:::::" + (b++));//32 >>>>33
		System.out.println("Internal Value of B ::::::" + b);//33
		
		
		System.out.println("********************************************");
		int c = 40;
		System.out.println("Before C Value:::::"+ c); //40
		System.out.println("Operation -1  :::::"+ (c++));//40  >>>> 41
		System.out.println("Print-1 :::::"+ c);//41
		System.out.println("Operation -2  :::::"+ (++c));//42
		System.out.println("Print-2 ::::"+ c);//42
		System.out.println("Operation -3  :::::"+ (c++));//42  >>> 43
		System.out.println("Print-3 ::::"+ c);//43
		System.out.println("Operation -4  :::::"+ (++c));//44
		System.out.println("Print-4 ::::"+ c);//44
		System.out.println("Operation -5  :::::"+ (c++));//44
		System.out.println("print-5 ::::"+ c);//45
	}
}