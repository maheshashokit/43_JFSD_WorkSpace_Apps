package com.ashokit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.Registering the Jdbc Driver with DriverManager Service
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		try(
			//2.Getting Connection object through DriverManager Service	
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
				
			//3.Creating the Statement Object to execute the queries
			Statement st  = con.createStatement();
		   ){
			 
			//4.Executing the SQL Query i.e.,Inside the try block
			String insert_query ="insert into ashokit_students values(3,'Srinivas','Pune','12323232')";
			int rowAffected = st.executeUpdate(insert_query);
			
			//5.Processing the Business logic
			if(rowAffected != 0) {
				System.out.println("Row Inserted Database Successfully......");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
;