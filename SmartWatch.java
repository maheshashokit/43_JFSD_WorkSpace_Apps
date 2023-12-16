
public class SmartWatch extends BasicWatch {
	
	//Defining the Properties
	public double degreesOfTemperature;
	
	public void displayHealthInfo() {
		System.out.println("Displaying Health Information......");
	}
	
	public void doCalling() {
		System.out.println("DoCalling Facility.......");
	}
	
	public void setDegreesOfTemperature(double degreesOfTemperature) {
		this.degreesOfTemperature = degreesOfTemperature;
	}
	
	public void displayTemperature() {
		System.out.println("Temperature :::::" + degreesOfTemperature);
	}
}