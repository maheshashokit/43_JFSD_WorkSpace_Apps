
public class Phonepe implements Payment {

	@Override
	public void doPayment() {
		System.out.println("PhonePe doPayment()....");
	}
	
	@Override
	public void getScratchCard() {
		System.out.println("PhonePe getScratch().....");
	}

}
