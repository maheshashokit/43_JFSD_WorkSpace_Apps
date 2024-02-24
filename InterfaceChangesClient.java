
public class InterfaceChangesClient {

	public static void main(String[] args) {
		
		GooglePay gpay = new GooglePay();
		gpay.doPayment();
		gpay.getScratchCard();
		gpay.doScreenshot();
		gpay.applySecurity();
		//calling the static method using interface name
		Payment.display();
		
		System.out.println("***************************");
		
		Phonepe phonepe = new Phonepe();
		phonepe.doPayment();
		phonepe.getScratchCard();
		phonepe.doScreenshot();
		phonepe.applySecurity();
		//calling the static method using interface name
		Payment.display();
	}

}
