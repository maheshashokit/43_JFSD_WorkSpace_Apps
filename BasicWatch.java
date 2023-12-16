//This is Specialized Class to define Basic watch functionalities
public class BasicWatch extends Watch{
	
	//Defining the properties related to Date
	public int day;
	
	public int month;
	
	public int year;
	
	//Assigning the Time
	public void setDate(int day ,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//displaying the time on Watch
	public void displayDate() {
		System.out.println("Current Date is "+ day + " - " + month + " - "+ year);
	}
}