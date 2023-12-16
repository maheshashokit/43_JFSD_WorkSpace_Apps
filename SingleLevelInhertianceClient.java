
public class SingleLevelInhertianceClient {
	
	public static void main(String[] args) {
		
		//Creating the Object for BasicWatch Class
		BasicWatch bw = new BasicWatch();
		
		//Accessing the Properties from Parent Class
		bw.setTime(8, 49, 56); 
		bw.displayTime();
		
		//Accessing the properties from Child Class
		bw.setDate(15, 12, 2023);
		bw.displayDate();
		
		System.out.println("*****************************************************");
		
		//Creating the Object for Watch Class
		Watch wt = new Watch();
		
		//Accessing the properties for Watch Class
		wt.setTime(8,57,52);
		wt.displayTime();
		
	}
}
