package com.ashokit.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcTransactionManagementDemo {

	public static void main(String[] args) throws Exception {
		
		//Adding logic to get Database configuration from Properties file
		try(FileReader fr = new FileReader("src/Database.properties")){
			
			//creating properties class object
			Properties dbProps = new Properties();
			
			//loading the database properties
			dbProps.load(fr);
			
			String jdbcDriverClass = dbProps.getProperty("OracleJdbcDriverClass");
			String jdbcURL = dbProps.getProperty("OracleJdbcURL");
			String username = dbProps.getProperty("OracleUsername");
			String password = dbProps.getProperty("OraclePassword");
			String activeDatabase = dbProps.getProperty("ActiveDatabase");
			
			if("MYSQL".equals(activeDatabase.toUpperCase())) {
				jdbcDriverClass = dbProps.getProperty("MySQLJdbcDriverClass");
				jdbcURL = dbProps.getProperty("MySQLJdbcURL");
				username = dbProps.getProperty("MySQLUsername");
				password = dbProps.getProperty("MySQLPassword");
			}			

			Class.forName(jdbcDriverClass);
	
			try (Connection con = DriverManager.getConnection(jdbcURL, username, password);
	
				 Statement st = con.createStatement();
	
				 Scanner sc = new Scanner(System.in);) {
	
				System.out.println("Enter Source Account AccountNo For Transfer Amt...");
				String sourceAccountNo = sc.next();
				System.out.println("Enter Destination Account AccountNo For Transfer Amt...");
				String destinationAccountNo = sc.next();
				System.out.println("Enter Amount To be Transferred.....");
				int amount = sc.nextInt();
	
				// Disabling the AutoCommit mode
				con.setAutoCommit(false);
	
				// Adding our required query to batch
				st.addBatch("update ashokit_accounts set account_balance = account_balance - " + amount
						+ " where account_no='" + sourceAccountNo + "'");
				st.addBatch("update ashokit_accounts set account_balance = account_balance + " + amount
						+ " where account_no='" + destinationAccountNo + "'");
	
				// Executing queries as batch
				int[] rowsUpdateCount = st.executeBatch();
	
				// processing the rows Array
				boolean transactionStatus = true;
				for (int i = 0; i < rowsUpdateCount.length; i++) {
					if (rowsUpdateCount[i] == 0) { // Indicates the failure
						transactionStatus = false;
						break;
					}
				}
	
				// checking the transaction status flag
				if (transactionStatus) {
					con.commit();
					System.out.println("Amount Transferred Successfully......");
				} else {
					con.rollback();
					System.out.println("Amount Transferred Error Due to Technical issue.........");
				}
		}
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	}
}