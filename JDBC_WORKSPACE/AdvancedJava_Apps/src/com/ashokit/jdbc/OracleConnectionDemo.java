package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionDemo {

	 public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		 //Creating Object for Type-4 Jdbc driver
		 //oracle.jdbc.driver.OracleDriver obj = new oracle.jdbc.driver.OracleDriver();
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		 //Registering the Jdbc driver with DriverManager service
		 //DriverManager.registerDriver(obj);
		 
		 //Obtaining the Database Connection object
		 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		 
		 if(con != null) {
			 System.out.println("Oracle Database Connected Successfully....");
		 }
	}
}
