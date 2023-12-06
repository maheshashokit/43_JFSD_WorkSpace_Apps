
public class LogicalOperatorsDemo {
	
	public static void main(String[] args) {
		
		int a = 30, b = 50;
		
		boolean logicalAnd  = (a > b ) && (b < a); //false
		boolean logicalOr   = (a > b )  || (b < a); //false
		boolean logicalNot  = !((a > b )  || (b < a));//true
		
		System.out.println("Logical And ......"+ logicalAnd);
		System.out.println("Logical Or ......"+ logicalOr);
		System.out.println("Logical Not ......"+ logicalNot);
	}
}