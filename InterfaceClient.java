
public class InterfaceClient {
	
	public static void main(String[] args) {
		
		//Creating the Implementation class objects
		OracleDbConnectivity odc = new OracleDbConnectivity();
		System.out.println(odc.connectToDatbase("Oracle", "21C"));
		odc.displayDatabaseDetails();
		
		System.out.println();
		
		MySqlConnectivity msc = new MySqlConnectivity();
		System.out.println(msc.connectToDatbase("MySql", "8.x"));
		msc.displayDatabaseDetails();
		
		System.out.println();
		
		//creating the interface variable and holding implementation class object
		DbConnectivity dbc = new OracleDbConnectivity();
		System.out.println(dbc.connectToDatbase("Oracle", "19C"));
		dbc.displayDatabaseDetails();
	}
}