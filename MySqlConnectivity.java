public class MySqlConnectivity implements DbConnectivity {

	@Override
	public String connectToDatbase(String databaseName, String databaseVersion) {
		System.out.println("Connecting To MySQL Database........");
		return String.format("Database Name %s and Database Version %s", databaseName,databaseVersion);
	}

	@Override
	public void displayDatabaseDetails() {
		System.out.println("This is MySqlConnectivity Class....");
	}
}