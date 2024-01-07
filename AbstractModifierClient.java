
public class AbstractModifierClient {
	
	public static void main(String[] args) {
		
		//Creating the Object for OracleDatabaseConnectivity
		DatabaseConnectivity dc = new OracleDatabaseConnectivity("Oracle 21C","21.1.1","07-01-2024"); //Upcasting
		System.out.println(dc.connectToDatabase()); //It will call Created Object class method
		
		System.out.println("****************************************************");
		//replacing the object for dc variable
		dc = new SqlServerDatabaseConnectivity("Sql Server DB","15.2.22","31-12-2023"); //upcasting
		System.out.println(dc.connectToDatabase()); //It will call Created Object class method
		
	}
}