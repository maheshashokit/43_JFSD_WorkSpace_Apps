
public class MultiLevelInheritanceClient {
	
	public static void main(String[] args) {
		
		//Creating the Object for SmartWatch Class
		SmartWatch sw = new SmartWatch();
		
		//Accessing the BasicWatch Properties
		sw.setDate(16,12,2023);
		sw.displayDate();
		
		//Accessing the Watch Properties
		sw.setTime(8, 12, 56);
		sw.displayTime();
		
		//Accessing the SmartWatch Properties
		sw.setDegreesOfTemperature(98.25d);
		sw.displayTemperature();
		sw.displayHealthInfo();
		sw.doCalling();
	}

}
