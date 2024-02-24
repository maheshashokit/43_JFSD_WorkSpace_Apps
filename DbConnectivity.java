public interface DbConnectivity {
	
	//Defining the fields
	public static final String VENDOR_NAME="Database Vendor Name";
	
	//Defining the abstract method
	public abstract String connectToDatbase(String databaseName,String databaseVersion);
	
	public abstract void displayDatabaseDetails();

}