
public final class EmployeeAppraisalPDFForm extends EmployeeAppraisalForm {
	
	public String typeOfForm = "PDF Apprasial Form";
	
	public String getEmployeeForm() {
		return "Employee Appraisal Form downloading as PDF.... For Backup References";
	}
	
	public void displayTypeOfForm() {
		System.out.println("Type Of Form ::::" + super.typeOfForm);
	}	
	
}