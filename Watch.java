//This common features for any kind of Watch i.e.,Generalized Class
public class Watch {
	
	//Displaying the Time
	public int hours;
	
	public int minutes;
	
	public int seconds;
	
	//Assigning the Time
	public void setTime(int hours ,int minutes,int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	//displaying the time on Watch
	public void displayTime() {
		System.out.println("Current Time is "+ hours + " ::" + minutes + " :: "+ seconds);
	}
	
}