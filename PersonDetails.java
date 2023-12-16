//This is For Hierarchical Inheritance (Parent Class)
public class PersonDetails {
	
	//Defining the Fields
	public String name;
    public String emailId;
    public String contactNo; //"1234567890";

    //Defining the Methods
    public void setPersonDetails(String name,String emailId,String contactNo){
         this.name = name;
         this.emailId = emailId;
         this.contactNo = contactNo;
    }

    public void displayPersonalDetailsInfo(){
        System.out.println("*********Personal Information********************");
        System.out.println("Name ::" + name+" EmailID ::" + emailId+" ContactNo ::" + contactNo); 
    }
}