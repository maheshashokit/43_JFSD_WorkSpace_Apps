//Assuming the below Java class provided by oracle Corporation
public class OracleDatabaseConnectivity extends DatabaseConnectivity {
	
	public String releaseDate;
	
     //Defining the Constructor
	public OracleDatabaseConnectivity() {
		//Internally call the parent class constructor i.e.,Default Constructor
		System.out.println("OracleDatabaseConnectivity ::: Default Constructor");
	}
	
	public OracleDatabaseConnectivity(String databaseName,String databaseVersion,String releaseDate) {
		super(databaseName,databaseVersion);
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String connectToDatabase() {
		//logic which specific to Oracle Corporation
		System.out.println("OracleDatabaseConnectivity :::: Logic Executed");
		return String.format("Database Connected with Database Name :: %s and Database Version :: %s and Database Release Date :: %s", databaseName,databaseVersion,releaseDate);
	}
}