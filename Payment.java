public interface Payment {
	
	public void doPayment();
	
	public void getScratchCard();
	
	public default void doScreenshot() {
		System.out.println("All Payment Systems Required this Screeshot Implementation....");
	}
	
	public default void applySecurity() {
		System.out.println("All Payment Systems Required the Security......");
	}
	
	public static void display() {
		System.out.println("This is display method implementation.....");
	}
}