
public class EmployeeAppraisalForm {
	
	public String typeOfForm ="HTML Apprasial Form";
	
	public final String APPLICATION_MESSAGE="Welcome To AshokIT Hyderabad.";

	public String getEmployeeForm() {
		return "Employee ApprasialForm displaying as HTML Form...In the browser";
	}
	
	//Declaring the final method to be overridden or not
	public final String display() {
		return "Welcome To AshokIT";
	}
	
	public final String display(Integer i) {
		return "";
	}
}
