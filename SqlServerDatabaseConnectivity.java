//Assuming the below Java class provided by Microsoft Corporation
public class SqlServerDatabaseConnectivity extends DatabaseConnectivity {
	
	public String releaseDate;
	
     //Defining the Constructor
	public SqlServerDatabaseConnectivity() {
		//Internally call the parent class constructor i.e.,Default Constructor
		System.out.println("SqlServerDatabaseConnectivity ::: Default Constructor");
	}
	
	public SqlServerDatabaseConnectivity(String databaseName,String databaseVersion,String releaseDate) {
		super(databaseName,databaseVersion);
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String connectToDatabase() {
		//logic which specific to Microsoft
		System.out.println("SqlServerDatabaseConnectivity :::: Logic Executed");
		return String.format("Database Connected with Database Name :: %s and Database Version :: %s and Database Release Date :: %s", databaseName,databaseVersion,releaseDate);
	}
}