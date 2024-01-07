
public class MethodOverridingClient {

	public static void main(String[] args) {
		
		//Creating the subclass object
		EmployeeAppraisalPDFForm  epdf = new EmployeeAppraisalPDFForm();
		System.out.println(epdf.typeOfForm);
		System.out.println(epdf.getEmployeeForm());
		
		System.out.println("******************************************************");
		
		//Another Version
		EmployeeAppraisalForm epf = new EmployeeAppraisalPDFForm();
		System.out.println(epf.typeOfForm);
		System.out.println(epf.getEmployeeForm());
		
		System.out.println("******************************************************");
		
		//creating the object for parent class
		EmployeeAppraisalForm epf1 = new EmployeeAppraisalForm();
		System.out.println(epf1.typeOfForm);
		System.out.println(epf1.getEmployeeForm());
		
		System.out.println("******************************************************");
		
		EmployeeAppraisalForm epf2 = new EmployeeAppraisalFillablePdfForm();
		System.out.println(epf2.typeOfForm);
		System.out.println(epf2.getEmployeeForm());
		
		System.out.println(ApplicationConstants.APPLICATION_MESSAGE);
	}

}
