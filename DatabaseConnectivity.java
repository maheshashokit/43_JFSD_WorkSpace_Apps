//Assuming that below class giving by sunmicrosystem
public abstract class DatabaseConnectivity {
	
	//Defining the Fields
	public String databaseName;
	public String databaseVersion;
	
	//Defining the Constructor
	public DatabaseConnectivity() {
		System.out.println("DatabaseConnectivy ::: Default Constructor...");
	}
	
	public DatabaseConnectivity(String databaseName,String databaseVersion) {
		System.out.println("DatabaseConnectivity ::: Param Constructor");
		this.databaseName = databaseName;
		this.databaseVersion = databaseVersion;
	}
	
	//Defining the abstract method
	public abstract String connectToDatabase();
	
	//Defining the concrete methods
	public void displayDatabaseDetails() {
		System.out.println("Database Name    ::::" + databaseName);
		System.out.println("Database Version ::::" + databaseVersion);
	}
}